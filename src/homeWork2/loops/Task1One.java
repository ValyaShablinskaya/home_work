package homeWork2.loops;

import java.util.Scanner;

public class Task1One {
    public static void main(String[] args) {

        long digit = Long.parseLong(args[0]);

        if (0 >= digit) {
            System.out.println("Введите положительное число");
        } else if (digit > Long.MAX_VALUE) {
            System.out.println("Число превышает допустимое значение");
        } else {
            multiply(digit);
        }
    }

    /**
     * Перемножает числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
     * @param digit введенное число
     */
    public static void multiply(long digit) {
        long result = 1;
        String str = "";

        for (int i = 1; i <= digit; i++) {
            if (i < digit) {
                str += i + " * ";
                result *= i;
            } else {
                result *= i;
                str += i + " = " + result;
                System.out.println(str);
            }
        }
    }
}


