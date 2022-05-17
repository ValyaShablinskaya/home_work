package homeWork5.provider;

import homeWork5.reader.FileReaders;
import homeWork5.reader.WriteFile;
import homeWork5.search.api.ISearchEngine;

import java.util.Objects;

public class SearchBookMaker {
    private final ViewProvider viewProvider;
    private final FileReaders fileReader;
    private final ISearchEngine iSearchEngine;
    private final WriteFile writeFile;

    public SearchBookMaker(ViewProvider viewProvider, FileReaders fileReader, ISearchEngine iSearchEngine,
                           WriteFile writeFile) {
        this.viewProvider = viewProvider;
        this.fileReader = fileReader;
        this.iSearchEngine = iSearchEngine;
        this.writeFile = writeFile;
    }

    /**
     * Выводит запрос пользователя и сохраняет его в файл
     * @param pathToRead путь к директории
     * @param pathToSave путь к файлу, в котором сохраняется результат
     */
    public void printResult(String pathToRead, String pathToSave) {
        boolean isWork = true;
        viewProvider.printMessage("Enter a book name: ");
        String choiceBook = viewProvider.readString();
        String bookAddress = fileReader.readFile(pathToRead + choiceBook);

        while (isWork) {
            viewProvider.printMessage("Enter a word: ");
            String choiceWord = viewProvider.readString();
            long result = iSearchEngine.search(bookAddress, choiceWord);

            if (Objects.equals(choiceWord, "return")) {
                isWork = false;
                printResult(pathToRead, pathToSave);
            } else {
                viewProvider.printMessage(String.valueOf(result));
                String save = String.format("%s - %s - %d%n", choiceBook, choiceWord, result);
                writeFile.writeFile(save, pathToSave);
            }
        }
    }
}
