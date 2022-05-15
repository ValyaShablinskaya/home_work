package homeWork5.runners;

import homeWork5.provider.WarAndPeace;
import homeWork5.reader.FileReaders;
import homeWork5.search.EasySearch;
import homeWork5.search.RegExSearch;
import homeWork5.search.SearchCaseInsensitive;
import homeWork5.search.SearchEnginePunctuationNormalizer;
import homeWork5.search.api.ISearchEngine;

import java.util.Map;

public class WarAndPeaceMain {
    public static void main(String[] args) {

        FileReaders fileReaders = new FileReaders();
        WarAndPeace warAndPeace = new WarAndPeace();

        String text = fileReaders.readFile("/home/valya/Война и мир_книга.txt");
        String[] textWithoutPunctuation = warAndPeace.removePunctuation(text);
        //System.out.println(Arrays.toString(textWithoutPunctuation));

        System.out.println("Колличество уникальных слов: " + warAndPeace.countUniqueWords(textWithoutPunctuation));

        Map<String, Integer> wordsAndCount = warAndPeace.wordsAndNumberOfRepetitions(textWithoutPunctuation);
        Map<String, Integer> wordsAndCountSort = warAndPeace.sortedWordsAndNumberOfRepetitions(wordsAndCount);
        System.out.println(warAndPeace.topWords(wordsAndCountSort, 10));

        ISearchEngine easySearch = new EasySearch();
        System.out.println(easySearch.search(text, "война"));
        System.out.println(easySearch.search(text, "и"));
        System.out.println(easySearch.search(text, "мир"));

        ISearchEngine regExSearch = new RegExSearch();
        System.out.println(regExSearch.search(text, "война"));
        System.out.println(regExSearch.search(text, "и"));
        System.out.println(regExSearch.search(text, "мир"));

        ISearchEngine searchEnginePunctuationNormalizer =
                new SearchEnginePunctuationNormalizer(easySearch, warAndPeace);
        System.out.println(searchEnginePunctuationNormalizer.search(text, "война"));
        System.out.println(searchEnginePunctuationNormalizer.search(text, "и"));
        System.out.println(searchEnginePunctuationNormalizer.search(text, "мир"));

        ISearchEngine searchCaseInsensitive = new SearchCaseInsensitive(regExSearch);
        System.out.println(searchCaseInsensitive.search(text, "война"));
        System.out.println(searchCaseInsensitive.search(text, "и"));
        System.out.println(searchCaseInsensitive.search(text, "мир"));
    }
}



