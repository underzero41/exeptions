package Seminar3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
//        rwLine(Path.of("test.txt"), Path.of("third"));

//        try {
//            doSomething(true);
//        } catch (IOException e) {
//            System.out.println("Task done");
//        }

//        try (Counter counter = new Counter()){
//            System.out.println(counter);
//            counter.add();
//            System.out.println(counter);
//            counter.close();
//            System.out.println(counter);
//            counter.add();
//            System.out.println(counter);
//        } catch (NullPointerException e) {
//            System.out.println("Catch");
//        }

//        try {
//            int i = 7/0;
//        } catch (RuntimeException e) {
//            throw new MyException();
//        }

//        try {
//            Integer[] arr = new Integer[]{1,2,3,null,5};
//            arr[3]++;
//        } catch (NullPointerException e) {
//            throw new ExceptionElement();
//        }

//        FileWriter fileWriter = null;
//        String path = "fourth.txt";
//        try (FileReader fileReader = new FileReader(path)) {
//            fileWriter.close();
//        } catch (FileNotFoundException e) {
//          throw new ExceptionFileFound(path);
//        }
        System.out.println(ex(new String[][]{
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}
        }));

    }


    //Напишите метод,на вход которогоподаётся двумерный строковый массив
    //размером 4х4. При подаче массива другого размера необходимо бросить
    //исключение MyArraySizeException.

    //Далее метод должен пройтисьпо всем элементам массива,преобразоватьв
    //int и просуммировать. Если в каком-то элементе массива преобразование
    //не удалось (например, в ячейке лежит символ или текст вместо числа),
    //должно быть брошено исключение MyArrayDataException с детализацией, в
    //какой именно ячейке лежат неверныеданные.

    public static int ex(String[][] strArray) {
        if (strArray.length != 4 || strArray[0].length != 4) {
            throw new MyArraySizeException();
        }
        return sumArray(strArray);
    }

    public static int sumArray(String[][] strArray) {
        int result = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[0].length; j++) {
                try {
                    result += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return result;
        
    }

    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        }
    }

    public static void doSomething(boolean fail) throws IOException {
        if (fail){
            throw new IOException();
        }
    }
}
