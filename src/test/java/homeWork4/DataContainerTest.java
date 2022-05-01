package homeWork4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataContainerTest {

    DataContainer<String> dataContainer = new DataContainer<>(new String[0]);

    @Test
    void addString() {
        String parameter = "Привет";
        int expected = 0;
        int actual = dataContainer.add(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void addStringNull() {
        String parameter = null;
        int expected = -1;
        int actual = dataContainer.add(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void addStringInTheMiddle() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", null, "До встречи"});
        String parameter = "Привет";
        int expected = 1;
        int actual = dataContainer.add(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void deleteIndex() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", "Привет", "До встречи"});
        int parameter = 1;
        boolean expected = true;
        boolean actual = dataContainer.delete(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void deleteIndexOutside() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", "Привет", "До встречи"});
        int parameter = 9;
        boolean expected = false;
        boolean actual = dataContainer.delete(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void deleteItem() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", "Привет", "До встречи"});
        String parameter = "Привет";
        boolean expected = true;
        boolean actual = dataContainer.delete(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void deleteNonexistentItem() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", "Привет", "До встречи"});
        String parameter = "Добрый день";
        boolean expected = false;
        boolean actual = dataContainer.delete(parameter);
        assertEquals(expected, actual);
    }

    @Test
    void toStringNull() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{"Пока", null, "До встречи"});
        String expected = "[Пока, До встречи]";
        String actual = dataContainer.toString();
        assertEquals(expected, actual);
    }

    @Test
    void toStringEmpty() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{});
        String expected = "[]";
        String actual = dataContainer.toString();
        assertEquals(expected, actual);
    }

    @Test
    void toStringOnlyNull() {
        DataContainer<String> dataContainer = new DataContainer<>(new String[]{null});
        String expected = "[]";
        String actual = dataContainer.toString();
        assertEquals(expected, actual);
    }
}