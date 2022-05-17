package homeWork5.provider;

import java.util.Scanner;

public class ViewProvider {
    private final Scanner scanner;

    public ViewProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Выводит данные в консоль
     * @param message сообщение для вывода в консоль
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Читает строку
     * @return возвращает введенную в консоль строку
     */
    public String readString() {
        return scanner.nextLine();
    }
}
