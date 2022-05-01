package homeWork2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи while
 */
public class WhileOperation implements IArraysOperation {
    /**
     * Выводит все элементы массива
     */
    @Override
    public String allElements(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < container.length) {
            str.append(container[i]);
            i++;
        }
        return str.toString();
    }

    /**
     * Выводит каждый второй элемент массива
     */
    @Override
    public String everySecondElements(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < container.length) {
            if ((i + 1) % 2 == 0) {
                str.append(container[i]);
            }
            i++;
        }
        return str.toString();
    }

    /**
     * Выводит все элементы массива в обратном порядке
     */
    @Override
    public String reverseOrder(int[] container) {
        int i = container.length - 1;
        StringBuilder str = new StringBuilder();
        while (i >= 0) {
            str.append(container[i]);
            i--;
        }
        return str.toString();
    }
}
