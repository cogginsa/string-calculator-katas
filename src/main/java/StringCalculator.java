public class StringCalculator{

    public String add(String str){
        String[] strArray = str.split(",|\\\n");

        int sum = 0;
        for (String value : strArray) {
            if(!value.isEmpty()){
                sum += Integer.parseInt(value);
            }
        }
        return Integer.toString(sum);
    }
}
