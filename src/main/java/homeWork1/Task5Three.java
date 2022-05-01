package homeWork1;

import java.util.Scanner;

public class Task5Three implements ICommunicationPrinter {

    /**
     * метод welcome при помощи опратора switch
     * @param name введенное пользователям имя
     * @return сообщение в зависемости от введенного имени
     */
    @Override
    public String welcome(String name) {
        String str1 = "Вася";
        String str2 = "Анастасия";
        String message = "";
        switch (name) {
            case "Вася":
                message = "Привет! \nЯ тебя так долго ждал";
                break;
            case "Анастасия":
                message = "Я тебя так долго ждал";
                break;
            default:
                message = "Добрый день, а вы кто?";
        }
        return message;
    }
}