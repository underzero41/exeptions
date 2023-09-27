package HomeWork2.Task3;

public class Main {
    public static void main(String[] args) throws Exception {
        arithmetic();
    }

    private static void arithmetic() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
