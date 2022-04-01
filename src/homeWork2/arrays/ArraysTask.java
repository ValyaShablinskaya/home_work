package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50, 100);

        sumEvenPositiveNumbers(container);
        maxEvenElement(container);
        lessArithmeticMean(container);
        lessElement(container);
        removeInterval(container);
        digitsSum(container);
    }

    /**
     * Сумма четных положительных элементов массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void sumEvenPositiveNumbers(int[] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > 0) {
                sum += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива: " + sum);
    }

    /**
     * Максимальный из элементов массива с четными индексами
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void maxEvenElement(int[] container) {
        int max = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > max) {
                max = container[i];
            }
        }
        System.out.println("Максимальный из элементов массива с четными индексами: " + max);
    }

    /**
     * Элементы массива, которые меньше среднего арифметического
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void lessArithmeticMean(int[] container) {
        int sum = 0;
        double arithmeticMean = 0;

        for (int i = 0; i < container.length; i++) {
            sum += container[i];
            arithmeticMean = sum / container.length;
            if (container[i] < arithmeticMean) {
                System.out.print(container[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Находит два наименьших (минимальных) элемента массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void lessElement(int[] container) {
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;

        for (int i = 0; i < container.length; i++) {
            if (container[i] < minOne) {
                minTwo = minOne;
                minOne = container[i];
            } else if (container[i] < minTwo && container[i] != minOne) {
                minTwo = container[i];
            }
        }
        if (minTwo != Integer.MAX_VALUE) {
            System.out.println("Второй минимальный элемент: " + minTwo);
        } else {
            System.out.println("Второго минимального элемента нет");
        }
        System.out.println("Минимальный элемент: " + minOne);
    }

    /**
     * Сжимается массив, удалив элементы, принадлежащие интервалу
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void removeInterval(int[] container) {
        int[] newContainer = null;
        int startElement = 2;
        int finalElement = 4;
        int offset = 0;

        for (int i = 0; i < container.length; i++) {
            if (i >= startElement && i <= finalElement) {
                offset++;
            } else {
                container[i - offset] = container[i];
            }
        }
        newContainer = Arrays.copyOf(container, container.length - offset);
        System.out.println(Arrays.toString(newContainer));
    }

    /**
     * Сумма цифр массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static void digitsSum(int[] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            int digit = i;
            while (digit > 0) {
                sum += digit % 10;
                digit /= 10;
            }
        }
        System.out.println("Сумма цифр массива: " + sum);
    }
}