package homeWork1;

public class Task3 {
    public static void main(String[] args) {
        double y;

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (37 - 5 + 1) + 5); // Заполнение массива случайными цифрами из диапазона
            System.out.print(array[i] + " ");
        }
        System.out.println();

        y = Math.random() * 10; //Возвращает значение, большее или равное 0.0 и меньшее 10
        System.out.println(y);

        y = Math.cbrt(8); //Возвращает кубический корень double значения
        System.out.println(y);

        y = Math.log(8); //Возвращает натуральный логарифм double значения.
        System.out.println(y);

        y = Math.pow(4, 5); //Возвращает значение первого аргумента, возведенного в степень второго аргумента
        System.out.println(y);

        y = Math.rint(5.8); //Возвращает значение, ближайшее по значению к аргументу и равное целому числу
        System.out.println(y);

        y = Math.scalb(5, 8); //возвращает произведение числа 5 на 2 в степени 8
        System.out.println(y);
    }
}
