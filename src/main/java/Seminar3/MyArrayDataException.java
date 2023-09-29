package Seminar3;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {super(String.format("Incorrect element in position %d:%d", i, j));}
}
