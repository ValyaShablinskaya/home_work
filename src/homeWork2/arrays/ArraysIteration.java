package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();

        allElements(container);
        everySecondElements(container);
        reverseOrder(container);
    }

    /**
     * Вывод всех элементов массива
     * @param container массив, полученный из метода arrayFromConsole
     */
    public static void allElements(int[] container) {

        for (int i = 0; i < container.length; i++) {

            System.out.print(container[i]);
        }
        System.out.println();
    }

    /**
     * Выводит каждый второй элемент массива в консоль
     * @param container массив, полученный из метода arrayFromConsole
     */
    public static void everySecondElements(int[] container) {

        for (int i = 0; i < container.length; i++) {
            if (i % 2 != 0) {

                System.out.print(container[i]);
            }
        }
        System.out.println();
    }

    /**
     * Вывести все элементы массива в консоль в обратном порядке
     * @param container массив, полученный из метода arrayFromConsole
     */
    public static void reverseOrder(int[] container) {

        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i]);
        }
    }
}