package Seminar3;

import java.io.Closeable;
import java.io.IOException;

// Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//значение внутренней int переменнойна 1.Сделайте так, чтобы с объектом
//такого типа можно было работать в блоке try-with-resources. Нужно бросить
//исключение, еслиработа с объектом типа счетчикбылане в ресурсномtry
//и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
//лучше всего.
public class Counter implements Closeable {
//    private int num = 0;
//    private boolean isClosed = false;
//    public void add() {
//        if (!isClosed) {
//            this.num ++;
//        } else {
//            throw new RuntimeException();
//        }
//
//    }


//    @Override
//    public void close() throws IOException {
//        this.isClosed = true;
//    }

    private Integer num = 0;
    public void add() {
            this.num ++;
    }

    public void close() {
        this.num = null;
    }
    @Override
    public String toString() {
        return "Counter{" +
                "num=" + num +
                '}';
    }
}
