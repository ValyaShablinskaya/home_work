package homeWork1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    void slipInShouldReturnTrueIfParametersEqualsTrue() {
        boolean weekday = true;
        boolean vacation = true;
        boolean expected = true;
        boolean actual = Task4.sleepIn(weekday, vacation);
        assertEquals(expected, actual);
    }

    @Test
    void slipInShouldReturnTrueIfParameterWeekdayEqualsFalse() {
        boolean weekday = false;
        boolean vacation = true;
        boolean expected = true;
        boolean actual = Task4.sleepIn(weekday, vacation);
        assertEquals(expected, actual);
    }

    @Test
    void slipInShouldReturnTrueIfParameterVacationEqualsFalse() {
        boolean weekday = true;
        boolean vacation = false;
        boolean expected = false;
        boolean actual = Task4.sleepIn(weekday, vacation);
        assertEquals(expected, actual);
    }
}