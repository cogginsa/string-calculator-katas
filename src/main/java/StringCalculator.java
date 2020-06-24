public class StringCalculator{

    public String add(String str){
        String[] strArray = str.split(",");

        int sum = 0;
        for (String value : strArray) {
            sum += Integer.parseInt(value);
        }
        return Integer.toString(sum);
    }
}
