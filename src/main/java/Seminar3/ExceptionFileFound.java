package Seminar3;

import java.io.FileNotFoundException;
import java.io.IOException;

//Создайте класс исключения, которое будет возникать при попытке открыть
//несуществующий файл. Исключение должно отображать понятное для
//пользователя сообщение об ошибке.
public class ExceptionFileFound extends FileNotFoundException  {
    public ExceptionFileFound(String path) {super(path + "File not found");}
}
