package homeWork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Если у вас рабочий день введите true, если выходной false");
        Boolean weekday = in.nextBoolean();

        System.out.println("Если у вас отпуск введите true, если нет false");
        Boolean vacation = in.nextBoolean();

        Boolean result = sleepIn(weekday, vacation);

        if (result) {
            System.out.println("Можете спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}