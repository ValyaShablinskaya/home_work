package homeWork2;

import homeWork2.loops.Task1Three;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1ThreeTest {
    private Task1Three task1Three = new Task1Three();
    @Test
    void multiplyNumber() {
        String[] parameter = {"181232375"};
        String expected = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080";
        String actual = task1Three.multiplyNumber(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNumberNegativeNumber() {
        String[] parameter = {"99.2"};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                task1Three.multiplyNumber(parameter));
        String expected = "Введено дробное число";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
    @Test
    void multiplyNumberOverflow() {
        String[] parameter = {"Привет"};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                task1Three.multiplyNumber(parameter));
        String expected = "Введено не число";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
}


