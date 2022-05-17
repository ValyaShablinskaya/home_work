package homeWork5.runners;

import homeWork5.provider.SearchBookMaker;
import homeWork5.provider.ViewProvider;
import homeWork5.reader.DirectoryReader;
import homeWork5.reader.FileReaders;
import homeWork5.reader.WriteFile;
import homeWork5.search.EasySearch;
import homeWork5.search.api.ISearchEngine;

import java.util.Scanner;

public class SearchBookMain {
    public static void main( String[] args ) {
        DirectoryReader directoryReader = new DirectoryReader();
        Scanner scanner = new Scanner(System.in);
        ViewProvider viewProvider = new ViewProvider(scanner);
        FileReaders fileReader = new FileReaders();
        WriteFile writeFile = new WriteFile();
        ISearchEngine iSearchEngine = new EasySearch();
        SearchBookMaker searchBookMaker = new SearchBookMaker(viewProvider, fileReader, iSearchEngine, writeFile);

        String path = "/home/valya/books/";
        String pathToSave = "/home/valya/books/result.txt";
        String booksInDirectory = directoryReader.printFiles(path);
        viewProvider.printMessage(booksInDirectory);
        viewProvider.printMessage("Enter return to choice the book");

        searchBookMaker.printResult(path, pathToSave);
    }
}
