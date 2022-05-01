package homeWork2.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        int[] containerTwo = arrayRandom(5, 100);

        System.out.println(Arrays.toString(container));
        System.out.println(Arrays.toString(containerTwo));
    }

    /**
     * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль
     *
     * @return массив типа int
     */
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = in.nextInt();

        int[] container = new int[length];
        System.out.println("Введите эллементы массива:");

        for (int i = 0; i < length; i++) {
            container[i] = in.nextInt();
        }
        return container;
    }

    /**
     * Данный метод принимает два аргумента и рандомным путем создает массив
     *
     * @param size              размер массива
     * @param maxValueExclusion указывает до какого числа генерировать рандомные числа
     * @return массив типа int
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] containerTwo = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            containerTwo[i] = rand.nextInt(maxValueExclusion);
        }
        return containerTwo;
    }
}

