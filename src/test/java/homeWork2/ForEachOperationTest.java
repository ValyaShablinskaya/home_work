package homeWork2;

import homeWork2.arrays.ForEachOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForEachOperationTest {
    ForEachOperation forEachOperation = new ForEachOperation();

    @Test
    void allElements() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "123456";
        String actual = forEachOperation.allElements(container);
        assertEquals(expected, actual);
    }

    @Test
    void everySecondElements() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "246";
        String actual = forEachOperation.everySecondElements(container);
        assertEquals(expected, actual);
    }

    @Test
    void reverseOrder() {
        int[] container = {1, 2, 3, 4, 5, 6};
        String expected = "654321";
        String actual = forEachOperation.reverseOrder(container);
        assertEquals(expected, actual);
    }
}