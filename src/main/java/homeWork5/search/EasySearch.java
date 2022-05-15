package homeWork5.search;

import homeWork5.search.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количество раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        int index = text.indexOf(word);
        long count = 0;

        while (index != -1) {
            count ++;
            index = text.indexOf(word, index + 1);
        }
        return count;
    }
}
