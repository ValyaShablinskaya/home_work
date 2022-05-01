package homeWork2;

import homeWork2.utils.SortsUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortUtilsTest {
    SortsUtils sortsUtils = new SortsUtils();

    @Test
    void bubbleOne() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        String expected = "[1, 2, 3, 4, 5, 6]";
        String actual = sortsUtils.bubble(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleTwo() {
        int[] parameter = {1, 1, 1, 1};
        String expected = "[1, 1, 1, 1]";
        String actual = sortsUtils.bubble(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleThree() {
        int[] parameter = {9, 1, 5, 99, 9, 9};
        String expected = "[1, 5, 9, 9, 9, 99]";
        String actual = sortsUtils.bubble(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleFour() {
        int[] parameter = {};
        String expected = "[]";
        String actual = sortsUtils.bubble(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void bubbleFive() {
        int[] parameter = {6, 5, 4, 3, 2, 1};
        String expected = "[1, 2, 3, 4, 5, 6]";
        String actual = sortsUtils.bubble(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void shakeOne() {
        int[] parameter = {1, 2, 3, 4, 5, 6};
        String expected = "[1, 2, 3, 4, 5, 6]";
        String actual = sortsUtils.shake(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void shakeTwo() {
        int[] parameter = {1, 1, 1, 1};
        String expected = "[1, 1, 1, 1]";
        String actual = sortsUtils.shake(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void shakeThree() {
        int[] parameter = {9, 1, 5, 99, 9, 9};
        String expected = "[1, 5, 9, 9, 9, 99]";
        String actual = sortsUtils.shake(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void shakeFour() {
        int[] parameter = {};
        String expected = "[]";
        String actual = sortsUtils.shake(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void shakeFive() {
        int[] parameter = {6, 5, 4, 3, 2, 1};
        String expected = "[1, 2, 3, 4, 5, 6]";
        String actual = sortsUtils.shake(parameter);
        assertEquals(expected, actual);
    }
}