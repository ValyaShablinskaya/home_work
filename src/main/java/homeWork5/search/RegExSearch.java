package homeWork5.search;

import homeWork5.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    /**
     *  Метод возвращает информации о количестве раз которое встречается слово в тексте (с учетом регистра)
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количество раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        String regex = "\\b" + word + "\\b";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);
        return matcher.results().count();
    }
}
