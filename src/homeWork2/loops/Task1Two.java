package homeWork2.loops;

import java.util.Scanner;

public class Task1Two {
    public static void main(String[] args) {

        long digit = Long.parseLong(args[0]);

        System.out.println(multiply(digit));
    }

    /**
     * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
     * @param digit введенное число
     * @return результат умножения
     */
    public static long multiply(long digit) {
        long result = 1;

        if (digit == 0) {
            System.out.print(" = ");
            return result;
        }
        if (digit == 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        System.out.print(digit);
        if (digit != 2) {
            System.out.print(" * ");
        }
        result = digit * multiply(digit - 1);
        return result;
    }

}

