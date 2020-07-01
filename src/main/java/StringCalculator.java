public class StringCalculator{

    public String add(String str){
        String[] strArray = str.split(",|\\\n");

        int total = 0;
        for (String value : strArray) {
            if(!value.isEmpty()) {
                total += Integer.parseInt(value);
            }
        }
        return Integer.toString(total);
    }

}
