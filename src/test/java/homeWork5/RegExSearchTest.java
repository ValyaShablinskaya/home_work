package homeWork5;

import homeWork5.search.RegExSearch;
import homeWork5.search.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegExSearchTest {

    ISearchEngine regExSearch = new RegExSearch();

    @Test
    void searchWithExamplesFromHomework() {
        String text1 = "привет, как дела!";
        String text2 = "привет,какдела!";
        String text3 = "привет;какдела!";
        String text4 = "как дела!.Что делаешь?";
        String text5 = "Привет-привет";
        String text6 = "Привет -привет";
        String text7 = "4-х";
        String text8 = "один и 1";
        String text9 = "бабушка бабушке бабушку";

        Assertions.assertEquals(1, regExSearch.search(text1, "привет"));
        Assertions.assertEquals(1, regExSearch.search(text1, "как"));
        Assertions.assertEquals(1, regExSearch.search(text1, "дела"));
        Assertions.assertEquals(1, regExSearch.search(text2, "какдела"));
        Assertions.assertEquals(1, regExSearch.search(text3, "привет"));
        Assertions.assertEquals(1, regExSearch.search(text3, "какдела"));
        Assertions.assertEquals(1, regExSearch.search(text4, "как"));
        Assertions.assertEquals(1, regExSearch.search(text4, "дела"));
        Assertions.assertEquals(1, regExSearch.search(text4, "Что"));
        Assertions.assertEquals(1, regExSearch.search(text4, "делаешь"));
        Assertions.assertEquals(1, regExSearch.search(text5, "Привет-привет"));
        Assertions.assertEquals(1, regExSearch.search(text6, "Привет"));
        Assertions.assertEquals(1, regExSearch.search(text6, "привет"));
        Assertions.assertEquals(1, regExSearch.search(text7, "4-х"));
        Assertions.assertEquals(1, regExSearch.search(text8, "один"));
        Assertions.assertEquals(1, regExSearch.search(text8, "и"));
        Assertions.assertEquals(1, regExSearch.search(text8, "1"));
        Assertions.assertEquals(1, regExSearch.search(text9, "бабушка"));
        Assertions.assertEquals(1, regExSearch.search(text9, "бабушке"));
        Assertions.assertEquals(1, regExSearch.search(text9, "бабушка"));
    }

    @Test
    void searchCaseSensitive() {
        String text = "Хищник в роще рыщет – хищник пищу ищет.";
        long expected = 1;
        long actual = regExSearch.search(text, "Хищник");
        assertEquals(expected, actual);
    }

    @Test
    void searchPassageFromTheBook() {
        String text = "Потом говорили, что человек этот пришел с севера, со стороны Канатчиковых ворот.\n" +
                "Он шел, а навьюченную лошадь вел под уздцы. Надвигался вечер, и лавки канатчиков и шорников\n" +
                "уже закрылись, а улочка опустела. Было тепло, но на человеке был черный плащ, накинутый на плечи.\n" +
                "Он обращал на себя внимание.\n" +
                "\n" +
                "Путник остановился перед трактиром «Старая Преисподняя», постоял немного, прислушиваясь к гулу\n" +
                "голосов. Трактир, как всегда в это время, был полон народу.\n" +
                "\n" +
                "Незнакомец не вошел в «Старую Преисподнюю», а повел лошадь дальше, вниз по улочке к другому\n" +
                "трактиру, поменьше, который назывался «У Лиса». Здесь было пустовато – трактир пользовался не\n" +
                "лучшей репутацией. Трактирщик поднял голову от бочки с солеными огурцами и смерил гостя взглядом.\n" +
                "Чужак, все еще в плаще, стоял перед стойкой твердо, неподвижно и молчал.\n" +
                "– Что подать?\n" +
                "– Пива, – сказал незнакомец. Голос был неприятный.\n" +
                "Трактирщик вытер руки полотняным фартуком и наполнил щербатую глиняную кружку.";
        long expected = 2;
        long actual = regExSearch.search(text, "лошадь");
        assertEquals(expected, actual);
    }
}

