package homeWork5.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    /**
     * Записывает результаты поиска в фаил
     * @param value объект, который записывается в фаил
     * @param path путь к файлу
     */
    public void writeFile(String value, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(value);
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found", e);
        }
    }
}
