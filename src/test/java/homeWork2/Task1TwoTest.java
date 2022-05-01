package homeWork2;

import homeWork2.loops.Task1Two;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1TwoTest {
    private Task1Two task1Two = new Task1Two();

    @Test
    void multiplyNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                task1Two.multiply(-5));
        String expected = "Введите положительное число";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
    @Test
    void multiplyOverflow() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                task1Two.multiply(25));
        String expected = "Произойдет переполнение. Введите число менее 20";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
}
