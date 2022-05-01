package homeWork2.loops;
import java.util.Scanner;

public class Task1FourMain {
    public static void main(String[] args) {
        Task1Four task1Four = new Task1Four();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое хотите возвести в степень");
        double digit = in.nextDouble();

        System.out.println("Введите степень числа");
        long powDigit = in.nextLong();
        System.out.println(task1Four.exponentiation(digit, powDigit));
    }
}
