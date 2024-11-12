package TaskHandler;

import Exercises.TasksHandler.FileHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

interface TaskHandlerInterface {
    boolean createTask(
            String title, String description, Date endDate
    );

    List<String> listAllTask();
}

public class TaskHandler implements TaskHandlerInterface {
    private String filePath;
    private FileHandler fileHandler;

    public TaskHandler(String filePath) {
        this.filePath = filePath;
        this.fileHandler = new FileHandler();

        this.fileHandler.createFileWithPath(filePath);
    }

    @Override
    public boolean createTask(String title, String description, Date endDate) {
        var newTask = new Task(title, description, endDate, Task.Status.NEW);

        this.fileHandler.addNewValue(this.filePath, newTask.toString());
        return true;
    }

    @Override
    public List<String> listAllTask() {
        try {
            return Files.readAllLines(Paths.get(this.filePath));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return List.of();
        }
    }
}
