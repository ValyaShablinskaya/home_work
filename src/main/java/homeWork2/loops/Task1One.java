package homeWork2.loops;

import java.util.Scanner;

public class Task1One {

    /**
     * Перемножает числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
     * используя цикл
     *
     * @param digit введенное число
     *              return процес умножения и результат
     */
    public static String multiply(long digit) {
        long result = 1;
        String str = "";
        if (0 >= digit) {
            throw new IllegalArgumentException("Введите положительное число");
        } else if (digit > 20) {
            throw new IllegalArgumentException("Произойдет переполнение. Введите число менее 20");
        } else {
            for (int i = 1; i <= digit; i++) {
                if (i < digit) {
                    str += i + " * ";
                    result *= i;
                } else {
                    result *= i;
                    str += i + " = " + result;
                }
            }
        }
        return str;
    }
}

