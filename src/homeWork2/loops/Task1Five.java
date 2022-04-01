package homeWork2.loops;

import java.util.Scanner;

public class Task1Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        long digit = in.nextLong();

        multiply(3);
        multiply(188);
        multiply(-3);
        multiply(digit);
    }

    /**
     * Умножает число long пока не произойдёт переполнение
     * @param digit введенное число
     */
    public static void multiply(long digit) {
        long a = 1;

        if (digit > 0) {
            while (a <= Long.MAX_VALUE / digit) {
                a *= digit;
            }
            System.out.println(a);
        } else {
            while (a >= Long.MIN_VALUE / -digit && a <= Long.MAX_VALUE / -digit) {
                a *= digit;
            }
            System.out.println(a);
        }
    }
}
