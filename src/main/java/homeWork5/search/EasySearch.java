package homeWork5.search;

import homeWork5.search.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    private final String punctuation = " !\"#$%&'()*+,-./:;<=>?@[\\]^_'{|}~";

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количество раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        int index = -1;
        long count = 0;
        int textLength = text.length();
        int wordLength = word.length();

        do {
            index = text.indexOf(word, index + 1);
            if(index != -1){
                if(index == 0){
                    count++;
                    break;
                }
                char beforeChar = text.charAt(index - 1);
                if(punctuations(beforeChar)) {
                    int afterCharIndex = index + wordLength;
                    if(textLength >= afterCharIndex){
                        if(textLength == afterCharIndex){
                            count++;
                            break;
                        }
                        char afterChar = text.charAt(index + wordLength);
                        if(punctuations(afterChar)){
                            count++;
                        }
                    }
                }
            }
        } while (index != -1);

        return count;
    }

    private boolean punctuations(char c){
        return punctuation.indexOf(c) != -1;
    }
}
