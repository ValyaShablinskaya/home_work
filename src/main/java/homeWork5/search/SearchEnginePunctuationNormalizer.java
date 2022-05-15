package homeWork5.search;

import homeWork5.search.api.ISearchEngine;
import homeWork5.provider.WarAndPeace;

import java.util.Arrays;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;
    private final WarAndPeace warAndPeace;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine, WarAndPeace warAndPeace) {
        this.iSearchEngine = iSearchEngine;
        this.warAndPeace = warAndPeace;
    }

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количество раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        String newText = Arrays.toString(warAndPeace.removePunctuation(text));
            return this.iSearchEngine.search(newText, word);
    }
}
