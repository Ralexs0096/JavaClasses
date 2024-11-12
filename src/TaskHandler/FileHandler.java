package TaskHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

interface FileHandlerInterface {
    boolean createFileWithPath(String filePath);

    List<String> readFileByPath(String filePath);

    boolean addNewValue(String filePath, String newValue);

    boolean updateFileByPath(String filePath, String newValue);
}

public class FileHandler implements FileHandlerInterface {
    @Override
    public boolean createFileWithPath(String filePath) {
        try {
            File fileWriter = new File(filePath);
            fileWriter.createNewFile();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<String> readFileByPath(String filePath) {
        Path existingFilePath = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(existingFilePath);
            return lines;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return List.of();
        }
    }

    @Override
    public boolean addNewValue(String filePath, String newValue) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(newValue);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateFileByPath(String filePath, String newValue) {
        return false;
    }
}
