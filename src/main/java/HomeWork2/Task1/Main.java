package HomeWork2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float input = getFloatInput();
        System.out.println("Result -> " + input);
    }

    private static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float res = 0;
        boolean wrong = true;
        do {
            System.out.println("Type of float number -> ");
            if (scanner.hasNextFloat()) {
                res = scanner.nextFloat();
                wrong = false;
            } else {
                System.out.println("Need float");
                scanner.next();
            }
        } while (wrong);
        scanner.close();
        return res;
    }
}
