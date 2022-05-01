package homeWork1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5ThreeTest {
    private ICommunicationPrinter task5Three = new Task5Three();

    @Test
    @DisplayName("Введено имя Вася")
    void welcomeFirstName() {
        String parameter = "Вася";
        String expected = "Привет! \nЯ тебя так долго ждал";
        String actual = task5Three.welcome(parameter);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Введено имя Анастасия")
    void welcomeSecondName() {
        String parameter = "Анастасия";
        String expected = "Я тебя так долго ждал";
        String actual = task5Three.welcome(parameter);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Введено другое имя")
    void welcomeAnotherName() {
        String parameter = "Валя";
        String expected = "Добрый день, а вы кто?";
        String actual = task5Three.welcome(parameter);
        assertEquals(expected, actual);
    }
}

