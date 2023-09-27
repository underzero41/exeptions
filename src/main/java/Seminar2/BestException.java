package Seminar2;

//Реализовать наследника рантайм эксепшена
public class BestException extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage() + "Send from best exception";
    }

    public BestException(String message) {
        super(message);
    }
}
