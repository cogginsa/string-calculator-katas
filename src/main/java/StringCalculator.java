public class StringCalculator{

    public String add(String str){
        int sum = 0;
        try {
            String[] validatedArray = validateInput(str.split(",|\\\n"));

            for (String value : validatedArray) {
                if(!value.isEmpty()){
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

}
