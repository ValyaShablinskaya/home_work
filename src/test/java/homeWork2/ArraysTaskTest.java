package homeWork2;

import homeWork2.arrays.ArraysTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTaskTest {
    ArraysTask arraysTask = new ArraysTask();

    @Test
    void sumEvenPositiveNumbers() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        int expected = 12;
        int actual = arraysTask.sumEvenPositiveNumbers(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void maxEvenElement() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        int expected = 6;
        int actual = arraysTask.maxEvenElement(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void lessArithmeticMean() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        String expected = "[1, 2]";
        String actual = arraysTask.lessArithmeticMean(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void lessElement() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        String expected = "Минимальный элемент: 1 Второй минимальный элемент: 2";
        String actual = arraysTask.lessElement(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void removeInterval() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        String expected = "[1, 2, 6]";
        String actual = arraysTask.removeInterval(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void digitsSum() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        int expected = 21;
        int actual = arraysTask.digitsSum(parameter);
        assertEquals(expected, actual);
    }
}