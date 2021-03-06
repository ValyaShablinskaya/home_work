package homeWork1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число");
        int digit = in.nextInt();
        System.out.println(toBinaryString(digit));
    }

    public static String toBinaryString(int digit) {
        int remainder;
        String str = "";
        int length = 8;

        if (digit == 0) {
            str = "00000000";
        } else if (digit > 0) {
            while (digit > 0) {
                remainder = (digit % 2);
                str = Integer.toString(remainder) + str;
                digit = digit / 2;
            }
            if (str.length() >= length) {
                return str;
            } else if (str.length() < length) {
                StringBuilder sb = new StringBuilder();
                while (sb.length() < length - str.length()) {
                    sb.append('0');
                }
                sb.append(str);
                return sb.toString();
            }
        } else if (digit < 0) {
            digit = -1 * digit;
            digit = digit - 1;

            while (digit > 0) {
                remainder = (digit % 2);
                str = Integer.toString(remainder) + str;
                digit = digit / 2;
            }
            str = str.replace('1', '2');
            str = str.replace('0', '1');
            str = str.replace('2', '0');
            str = "1" + str;
            if (str.length() >= length) {
                return str;
            } else if (str.length() < length) {
                StringBuilder sb = new StringBuilder();
                while (sb.length() < length - str.length()) {
                    sb.append('1');
                }
                sb.append(str);
                return sb.toString();
            }
        }
        return str;
    }
}
