package homeWork1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber(int[] array) {
        String arrayToString = Arrays.toString(array)
                .replace("[", "")
                .replace(",", "")
                .replace(" ", "")
                .replace("]", "");

        String firstDigits = arrayToString.substring(0, 3);
        String secondDigits = arrayToString.substring(3, 6);
        String lastDigits = arrayToString.substring(6, 10);
        String result = String.format("(%s) %s-%s", firstDigits, secondDigits, lastDigits);
        return result;
    }
}
