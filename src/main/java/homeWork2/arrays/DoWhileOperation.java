package homeWork2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи do...while
 */
public class DoWhileOperation implements IArraysOperation {

    /**
     * Выводит все элементы массива
     */
    @Override
    public String allElements(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        do {
            str.append(container[i]);
            i++;
        } while (i < container.length);
        return str.toString();
    }

    /**
     * Выводит каждый второй элемент массива
     */
    @Override
    public String everySecondElements(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        do {
            if ((i + 1) % 2 == 0) {
                str.append(container[i]);
            }
            i++;
        } while (i < container.length);
        return str.toString();
    }

    /**
     * Выводит все элементы массива в обратном порядке
     */
    @Override
    public String reverseOrder(int[] container) {
        int i = container.length - 1;
        StringBuilder str = new StringBuilder();
        do {
            str.append(container[i]);
            i--;
        } while (i >= 0);
        return str.toString();
    }
}
