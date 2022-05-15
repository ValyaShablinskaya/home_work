package homeWork5.search;

import homeWork5.search.api.ISearchEngine;

public class SearchCaseInsensitive implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public SearchCaseInsensitive(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте (без учета регистра)
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количество раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        return this.iSearchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}
