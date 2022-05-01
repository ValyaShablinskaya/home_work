package homeWork1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {

    @Test
    @DisplayName("ВВедено число 42")
    void toBinaryStringFirstPositiveNumber() {
        int digit = 42;
        String expected = "00101010";
        String actual = Task7.toBinaryString(digit);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ВВедено число 15")
    void toBinaryStringSecondPositiveNumber() {
        int digit = 15;
        String expected = "00001111";
        String actual = Task7.toBinaryString(digit);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ВВедено число -42")
    void toBinaryStringFirstNegativeNumber() {
        int digit = -42;
        String expected = "11010110";
        String actual = Task7.toBinaryString(digit);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ВВедено число -15")
    void toBinaryStringSecondNegativeNumber() {
        int digit = -15;
        String expected = "11110001";
        String actual = Task7.toBinaryString(digit);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ВВедено число 0")
    void toBinaryStringZero() {
        int digit = 0;
        String expected = "00000000";
        String actual = Task7.toBinaryString(digit);
        assertEquals(expected, actual);
    }
}