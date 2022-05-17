пакет homeWork5.provider:
SearchBookMaker - класс, который выводит запрос пользователя и сохраняет его в файл (задание 7);
ViewProvider - класс, который реализует сканер и простой метод вывода в консоль (задание 7);
WarAndPeace - класс с методами создания и обработки коллекций (задание 2.1, 2.2);
пакет homeWork5.reader:
DirectoryReader - выводит отформатированный список файлов (задание 7);
FileReaders - для чтения файла (задание 2.1, 7);
WriteFile - записывает результаты поиска в фаил (задание 7);
пакет homeWork5.runners:
SearchBookMain - класс с точкой входа для классов (задание 7);
WarAndPeaceMain - класс с точкой входа для классов (задание 2 - 5);
пакет homeWork5.search.api:
ISearchEngine - интерфейс с методом поиска слов в тексте (задание 3);
пакет homeWork5.search:
EasySearch - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова (задание 4.1);
RegExSearch - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова (задание 4.2);
SearchCaseInsensitive - класс, реализующий интерфейс ISearchEngine с методами для поиска заданного слова (задание 4.4);
SearchEnginePunctuationNormalizer - класс, реализующий интерфейс ISearchEngine с методами для поиска 
заданного слова (задание 4.3);
пакет test.homeWork5:
EasySearchTest - класс, тестирующий EasySearch (задание 6);
RegExSearchTest - класс, тестирующий RegExSearch (задание 6);
SearchCaseInsensitiveTest - класс, тестирующий SearchCaseInsensitive (задание 6);
SearchEnginePunctuationNormalizeTest - класс, тестирующий SearchEnginePunctuationNormalize (задание 6);