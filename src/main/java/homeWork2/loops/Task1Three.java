package homeWork2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Task1Three {

    //Все цифры из числа введенного через аргумент к исполняемой
    // программе перемножает между собой и выводит ход вычислений в консоль
    public static String multiplyNumber(String[] args) {
        int digit = 0;
        int multiply = 1;
        int decimal;
        String str = "";
        String strFromArray = "";

        for (int i = 0; i < args.length; i++) {
            strFromArray = args[i];
        }

        if (strFromArray.indexOf('.') != -1) {
            throw new IllegalArgumentException("Введено дробное число");
        } else if (strFromArray.matches("^[а-яА-Яa-zA-Z]+$")) {
            throw new IllegalArgumentException("Введено не число");
        } else {

            for (int i = 0; i < args.length; i++) {
                digit = Integer.parseInt(args[i]);
            }

            while (digit % 10 != 0) {
                int i = 0;
                decimal = digit % 10;

                if (digit / 10 == 0) {
                    str = decimal + str;
                } else {
                    str = " * " + decimal + str;
                }
                multiply *= decimal;
                digit = digit / 10;
            }
        }
        return str + " = " + multiply;
    }
}