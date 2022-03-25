package homeWork1;

import java.util.Scanner;

public class Task5One {
    public static void main(String[] args) {
        String str1 = "Вася";
        String str2 = "Анастасия";

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        if (name.equals(str1)) {
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }
        if (name.equals(str2)) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals(str1) && !name.equals(str2)) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

