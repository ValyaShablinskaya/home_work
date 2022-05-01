package homeWork2.loops;

import java.util.Scanner;

public class Task1Five {
    /**
     * Умножает число long пока не произойдёт переполнение
     *
     * @param digit введенное число
     */
    public static long multiply(long digit) {
        long a = 1;

        if (digit > 0) {
            while (a <= Long.MAX_VALUE / digit) {
                a *= digit;
            }
            return a;
        } else {
            while (a >= Long.MIN_VALUE / -digit && a <= Long.MAX_VALUE / -digit) {
                a *= digit;
            }
            return a;
        }
    }
}
