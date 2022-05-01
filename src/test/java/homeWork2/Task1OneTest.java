package homeWork2;

import homeWork2.loops.Task1One;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1OneTest {
    private Task1One task1One = new Task1One();

    @Test
    void multiply() {
        long parameter = 5;
        String expected = "1 * 2 * 3 * 4 * 5 = 120";
        String actual = task1One.multiply(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNegativeNumber() {
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
               task1One.multiply(-5));
       String expected = "Введите положительное число";
       String actual = exception.getMessage();
       assertEquals(expected, actual);
    }
    @Test
    void multiplyOverflow() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                task1One.multiply(25));
        String expected = "Произойдет переполнение. Введите число менее 20";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
}
