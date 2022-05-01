package homeWork2;

import homeWork2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileOperationTest {
    DoWhileOperation doWhileOperation = new DoWhileOperation();

    @Test
    void allElements() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "123456";
        String actual = doWhileOperation.allElements(container);
        assertEquals(expected, actual);
    }

    @Test
    void everySecondElements() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "246";
        String actual = doWhileOperation.everySecondElements(container);
        assertEquals(expected, actual);
    }

    @Test
    void reverseOrder() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "654321";
        String actual = doWhileOperation.reverseOrder(container);
        assertEquals(expected, actual);
    }
}