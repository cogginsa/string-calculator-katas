import java.util.ArrayList;
import java.util.List;

public class StringCalculator{

    public String add(String str){
        int total = 0;
        try{
            String[] validatedStringArray = validateArray(str.split(",|\\\n"));
            for (String value : validatedStringArray) {
                if(!value.isEmpty()) {
                    total += Integer.parseInt(value);
                }
            }
        } catch (NegativeNumberException e){
            System.out.println(e);
        }
        return Integer.toString(total);
    }

    public String[] validateArray(String[] strings){
        List<String> negatives = new ArrayList<String>();
        for(String value : strings){
            if(!value.isEmpty() && Integer.parseInt(value) < 0){
                negatives.add(value);
            }
        }
        if(negatives.isEmpty()){
            throw new NegativeNumberException(negatives.toString());
        }
        return strings;
    }

}
