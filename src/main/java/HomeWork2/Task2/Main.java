package HomeWork2.Task2;

public class Main {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] array2 = { 1, 2, 3, 4 };
        divide(array1, 5);
        divide(array1, 0); // throw ArithmeticException
        divide(array2, 5); // throw IndexOutOfBoundsException
        divide(array2, 0); // throw IndexOutOfBoundsException
    }

    private static void divide(int[] array, int divider) {
        try {
            double result = array[8] / divider;
            System.out.println("result = " + result);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
    }
}
