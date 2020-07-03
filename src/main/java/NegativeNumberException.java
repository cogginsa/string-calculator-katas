public class NegativeNumberException extends RuntimeException{

    public NegativeNumberException(String negatives) {
        super("negatives not allowed:" + negatives);
    }

}
