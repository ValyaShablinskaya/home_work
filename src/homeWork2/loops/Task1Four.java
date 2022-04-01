package homeWork2.loops;

import java.util.Scanner;

public class Task1Four {

    // Возведение в степень
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое хотите возвести в степень");
        double digit = in.nextDouble();

        System.out.println("Введите степень числа");
        long degree = in.nextLong();
        double result = 1;

        if (digit > 0) {
            for (int i = 1; i <= degree; i++) {
                result = result * digit;
            }
            System.out.println(digit + " ^ " + degree + " = " + result);
        }
    }
}
