package Seminar3;

//Создайте класс исключений, которое будет возникать при обращении к
//пустому элементу в массиве ссылочного типа. Исключение должно
//отображать понятное для пользователя сообщение об ошибке
public class ExceptionElement extends NullPointerException {
    public ExceptionElement() {super("No, you cant");}
}
