package Seminar2;


import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

//        Реализовать алгоритм так, чтобы в нём был только один print
//        String res= "Exceptions not found";
//        try {
//          divine(5,0);
//        } catch (ArithmeticException e){
//          res = "Exceptions found";
//        } finally {
//          System.out.println(res);
//        }
//        Integer result = tempDivide(5,0);

        //    Сгенерировать исключение IOException
        //    Реализовать алгоритм отлавливающий несколько исключений. 1 IOException 2. Арифметика
//        try {
//            FileReader fileReader = new FileReader("file.txt");
//            String str = "";
//            while (fileReader.ready()){
//                str += (char)fileReader.read();
//            }
//            String[] strSplit = str.split(",");
//            int i = Integer.parseInt(strSplit[0])/Integer.parseInt(strSplit[1]);
//        } catch (IOException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

//        best exception
//        try {
//            bestException(5,0);
//        } catch (BestException e) {
//            System.out.println(e.getMessage());
//        }

// С выводом в консоль сообщения было исключение или нет.
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Input first number");
//            int a = scanner.nextInt();
//            System.out.println("Input second number");
//            int b = scanner.nextInt();
//            divine(a,b);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileWriter fileWriter = new FileWriter("qqq.txt")){
//            fileWriter.write("qqq");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            FileReader fileReader = new FileReader("qqq.txt");
//            while (fileReader.ready()) {
//                System.out.println((char) fileReader.read());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("www.txt");
            fileWriter.write("222");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    Написать приложение выкидывающие и перехватывающие исключение.
    С выводом в консоль сообщения было исключение или нет.
     */
    public static Integer divine(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Exception FOUND");
        return a / b;
    }

    //    Реализовать проброс через два метода.
    public static Integer tempDivide(int a, int b) throws ArithmeticException {
        return divine(a, b);
    }

//    Метод для best exception
    public static Integer bestException(int a, int b) throws BestException {
    if (b == 0)
        throw new BestException("");
    return a / b;
    }

}