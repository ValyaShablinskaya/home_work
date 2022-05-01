package homeWork2.loops;

import java.util.Scanner;

public class Task1FiveMain {
    public static void main(String[] args) {
        Task1Five task1Five = new Task1Five();
        Task1Six task1Six = new Task1Six();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        long digit = in.nextLong();

        System.out.println(task1Five.multiply(3));
        System.out.println(task1Five.multiply(188));
        System.out.println(task1Five.multiply(-3));
        System.out.println(task1Five.multiply(digit));
        task1Six.multiplicationTable();
    }
}
