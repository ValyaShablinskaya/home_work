package homeWork5.reader;

import java.awt.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {

    /**
     * Выводит отформатированный список файлов
     * @param path путь к директории
     * @return отформатированный список файлов
     */
    public String printFiles(String path) {
        return String.join("\n", readFile(path));
    }

    /**
     * Для отображения директории
     * @param pathToDirectory  путь к директории
     * @return коллекцию файло данной директории
     */
    private List<String> readFile(String pathToDirectory) {
        List<String> fileList = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(pathToDirectory))) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    fileList.add(path.getFileName()
                            .toString());
                }
            }
            return fileList;
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found", e);
        }
    }
}
