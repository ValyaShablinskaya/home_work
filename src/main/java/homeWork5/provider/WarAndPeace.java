package homeWork5.provider;

import java.util.*;

public class WarAndPeace {

    /**
     * Удаляет из строки нежелательные символы
     * @param text строка с помещенным в нее текстом из файла
     * @return массив строк
     */
    public String[] removePunctuation(String text) {
        return text.replaceAll("(\\.|,|:|;|=|\\*|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)", " ")
                .split(" ");
    }

    /**
     * Считае количество уникальных слов
     * @param words массив строк
     * @return количество уникальных слов
     */
    public int countUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords.size();
    }

    /**
     * Метод создает коллекцию Мар, помещая в Key наименование (слово), а в Value количество
     * раз, которое слово встречается в тексте это слово
     * @param words массив строк
     * @return коллекцию Мар со словами и их количеством в тексте
     */
    public Map<String, Integer> wordsAndNumberOfRepetitions(String[] words) {
        Map<String, Integer> numberOfWordsUse = new HashMap<>();

        for (String word : words) {

            if (!numberOfWordsUse.containsKey(word)) {
                numberOfWordsUse.put(word, 1);
            } else {
                Integer count = numberOfWordsUse.get(word);
                count++;
                numberOfWordsUse.put(word, count);
            }
        }
        return numberOfWordsUse;
    }

    /**
     * Метод наполняет коллекцию List значениями Key и Value из коллекции Мар и сортирует по количеству и наименованию
     * @param numberOfWordsUse коллекция Мар со словами и их количеством в тексте
     * @return отсортированную коллекцию
     */
    public Map<String, Integer> sortedWordsAndNumberOfRepetitions(Map<String, Integer> numberOfWordsUse) {
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(numberOfWordsUse.entrySet());
        sorted.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : sorted) {
            result.put(entry.getKey(), entry.getValue());
        }
        return  result;
    }

    /**
     * Метод выводит n Топ использованных в тексте слов
     * @param top отсортированная коллекция Map
     * @param index колличество использованных в тексте слов
     * @return возвращает слово и колличество еиспользования в тексте
     */
    public String topWords(Map<String, Integer> top, int index) {
        StringBuilder builder = new StringBuilder();
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(top.entrySet());

        for (Map.Entry<String, Integer> map : sorted) {
            builder.append(String.format("%s - %d раз%n", map.getKey(), map.getValue()));
            index--;

            if (index <= 0) {
                break;
            }
        }
        return builder.toString();
    }
}
