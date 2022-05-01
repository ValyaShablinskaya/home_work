package homeWork2.arrays;

/**
 * класс для реализации интерфейса ArraysOperation при помощи foreach
 */
public class ForEachOperation implements IArraysOperation {
    /**
     * Выводит все элементы массива
     */
    @Override
    public String allElements(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int j : container) {
            str.append(j);
        }
        return str.toString();
    }

    /**
     * Выводит каждый второй элемент массива
     */
    @Override
    public String everySecondElements(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (int j : container) {
            if ((i + 1) % 2 == 0) {
                str.append(j);
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
        StringBuilder str = new StringBuilder();
        for (int j : container) {
            str.insert(0, j);
        }
        return str.toString();
    }
}
