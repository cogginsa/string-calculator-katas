public class NegativeNumberException extends RuntimeException{

    public NegativeNumberException(String message) {
        super("negatives not allowed:" + message);
    }

}
