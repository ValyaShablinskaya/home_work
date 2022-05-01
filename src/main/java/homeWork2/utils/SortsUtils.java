package homeWork2.utils;

import java.util.Arrays;

public class SortsUtils {
    /**
     * Выполняет сортировку переданного массив при помощи алгоритма пузырьковая сортировка
     */
    public static String bubble(int[] container) {
        for (int i = 0; i < container.length; i++) {
            for (int j = container.length - 1; j > i; j--) {
                if (container[j - 1] > container[j]) {
                    int temp = container[j - 1];
                    container[j - 1] = container[j];
                    container[j] = temp;
                }
            }
        }
        return Arrays.toString(container);
    }

    /**
     * Выполняет сортировку переданного массив при помощи алгоритма алгоритма шейкерная сортировка
     */
    public static String shake(int[] container) {
        int left = 0;
        int right = container.length - 1;
        boolean availability = true;

        while ((left < right) && availability) {

            availability = false;

            for (int i = left; i < right; i++) {
                if (container[i] > container[i + 1]) {
                    int temp = container[i];
                    container[i] = container[i + 1];
                    container[i + 1] = temp;
                    availability = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (container[i - 1] > container[i]) {
                    int temp = container[i];
                    container[i] = container[i - 1];
                    container[i - 1] = temp;
                    availability = true;
                }
            }
            left++;
        }
        return Arrays.toString(container);
    }
}
