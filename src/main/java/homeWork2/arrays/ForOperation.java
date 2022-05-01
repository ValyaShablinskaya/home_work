package homeWork2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи for
 */
public class ForOperation implements IArraysOperation {
    /**
     * Выводит все элементы массива
     */
    @Override
    public String allElements(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < container.length; i++) {
            str.append(container[i]);
        }
        return str.toString();
    }

    /**
     * Выводит каждый второй элемент массива
     */
    @Override
    public String everySecondElements(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < container.length; i++) {
            if ((i + 1) % 2 == 0) {
                str.append(container[i]);
            }
        }
        return str.toString();
    }

    /**
     * Выводит все элементы массива в обратном порядке
     */
    @Override
    public String reverseOrder(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = container.length - 1; i >= 0; i--) {
            str.append(container[i]);
        }
        return str.toString();
    }
}
