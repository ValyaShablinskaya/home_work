package homeWork1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {

    @Test
    void createPhoneNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        String actual = Task6.createPhoneNumber(array);
        assertEquals(expected, actual);
    }
}
