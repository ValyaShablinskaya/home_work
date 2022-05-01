package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50, 100);

        int[] parameter = {1, 2, 3, 4, 5, 6};
        System.out.println(sumEvenPositiveNumbers(container));
        System.out.println(maxEvenElement(container));
        System.out.println(lessArithmeticMean(container));
        System.out.println(lessElement(container));
        System.out.println(removeInterval(container));
        System.out.println(digitsSum(parameter));
    }

    /**
     * Сумма четных положительных элементов массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static int sumEvenPositiveNumbers(int[] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > 0) {
                sum += container[i];
            }
        }
      return sum;
    }

    /**
     * Максимальный из элементов массива с четными индексами
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static int maxEvenElement(int[] container) {
        int max = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > max) {
                max = container[i];
            }
        }
       return max;
    }

    /**
     * Элементы массива, которые меньше среднего арифметического
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static String lessArithmeticMean(int[] container) {
        int sum = 0;
        int arithmeticMean;
        int lessThenArithmeticMean = 0;

        for (int i = 0; i < container.length; i++) {
            sum += container[i];
        }
        arithmeticMean = sum / container.length;
        for (int i : container) {
            if (i < arithmeticMean) {
                lessThenArithmeticMean++;
            }
        }
        int[] newContainer = new int[lessThenArithmeticMean];
        int newArrayCount = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < arithmeticMean) {
                newContainer[newArrayCount] = container[i];
                newArrayCount++;
            }
        }
        return Arrays.toString(newContainer);
    }
    /**
     * Находит два наименьших (минимальных) элемента массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static String lessElement(int[] container) {
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
            return "Минимальный элемент: " + minOne + " " + "Второй минимальный элемент: " + minTwo;
        } else {
            return "Минимальный элемент: " + minOne + " " + "Второго минимального элемента нет";
        }
    }

    /**
     * Сжимается массив, удалив элементы, принадлежащие интервалу
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static String removeInterval(int[] container) {
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
        return Arrays.toString(newContainer);
    }

    /**
     * Сумма цифр массива
     *
     * @param container массив, полученный из метода arrayRandom
     */
    public static int digitsSum(int[] container) {
        int sum = 0;
        int digit;
        for (int i = 0; i < container.length; i++) {
            while (container[i] % 10 != 0) {
                digit = container[i] % 10;
                sum += digit;
                container[i] /= 10;
            }
        }
        return sum;
    }
}