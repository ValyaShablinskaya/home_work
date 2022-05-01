package homeWork1;

import java.util.Scanner;

public class Task5Main {

    public static void main(String[] args) {
        ICommunicationPrinter task5One = new Task5One();
        ICommunicationPrinter task5Two = new Task5Two();
        ICommunicationPrinter task5Three = new Task5Three();

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println(task5One.welcome(name));
        System.out.println(task5Two.welcome(name));
        System.out.println(task5Three.welcome(name));
    }
}
