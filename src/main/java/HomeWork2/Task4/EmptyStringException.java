package HomeWork2.Task4;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("String can not be empty, try again.");
    }
}
