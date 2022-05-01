package homeWork1;

import java.util.Scanner;

public class Task5One implements ICommunicationPrinter {

    /**
     * метод welcome при помощи опратора if
     * @param name введенное пользователям имя
     * @return сообщение в зависемости от введенного имени
     */
    @Override
    public String welcome(String name) {
        String str1 = "Вася";
        String str2 = "Анастасия";
        String message = "";
        if (name.equals(str1)) {
            message = "Привет! \nЯ тебя так долго ждал";
        }
        if (name.equals(str2)) {
            message = "Я тебя так долго ждал";
        }
        if (!name.equals(str1) && !name.equals(str2)) {
            message = "Добрый день, а вы кто?";
        }
        return message;
    }
}
