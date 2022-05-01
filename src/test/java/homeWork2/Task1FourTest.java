package homeWork2;

import homeWork2.loops.Task1Four;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1FourTest {
    Task1Four task1Four = new Task1Four();

    @Test
    void exponentiation() {
        double parameterOne = 18;
        long parameterTwo = 5;
        String expected = "18.0 ^ 5 = 1889568.0";
        String actual = task1Four.exponentiation(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
    @Test
    void exponentiationFractionalNumber() {
        double parameterOne = 7.5;
        long parameterTwo = 2;
        String expected = "7.5 ^ 2 = 56.25";
        String actual = task1Four.exponentiation(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
}
