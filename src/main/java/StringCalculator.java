import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator{

    private String defaultDelimiterRegex = ",|\\\n";
    private String extractionRegex = "\\/(.)\\\n";


    public String add(String str){
        int sum = 0;
        try {
            String customDelimiterRegex = getCustomDelimeterRegex(str);
            String newStr = str.replace("//(.)\\\n", "");
            String[] validatedArray = validateInput(newStr.split(customDelimiterRegex));

            for (String value : validatedArray) {
                if(!value.isEmpty() && (Integer.parseInt(value) < 1000)){
                    sum += Integer.parseInt(value);
                }
            }
        } catch (NegativeNumberException error){
            System.out.println(error);
        }

        return Integer.toString(sum);
    }

    public String[] validateInput(String[] strArray){
        StringBuilder sb = new StringBuilder();
        for (String value : strArray) {
            if(!value.isEmpty() && Integer.parseInt(value) < 0){
                sb.append(value);
            }
        }

        if(!sb.toString().isEmpty()){
            throw new NegativeNumberException(sb.toString());
        }

        return strArray;
    }

    public String getCustomDelimeterRegex(String str){
        System.out.println("custom capture::" );

        Pattern pattern = Pattern.compile(extractionRegex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
            return defaultDelimiterRegex += "|" + matcher.group(1);
        } else return defaultDelimiterRegex;
    }

}
