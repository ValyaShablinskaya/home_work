package homeWork5.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

    /**
     *  Для чтения файла
     * @param filePath фаил, который требуется прочесть
     * @return возврощает фаил в виде строки
     */
    public String readFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine()).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found", e);
        }
    }
}
