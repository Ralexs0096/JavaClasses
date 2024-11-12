package TaskHandler;

import java.util.Date;
import java.util.UUID;

interface TaskInterface {
    String toString();
}

public class Task implements TaskInterface {
    private String title;
    private String description;
    private Date endDate;
    private Status status;
    private String taskId;

    static enum Status {
        NEW,
        IN_PROGRESS,
        COMPLETE
    }

    public Task(String title, String description, Date endDate, Status status) {
        this.title = title;
        this.description = description;
        this.endDate = endDate;
        this.status = status;
        this.taskId = UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 8);
    }

    @Override
    public String toString() {
        return String.format("""
                Task: {
                - id: %s
                - title: %s
                - description: %s
                - endDate: %tF
                - status: %s
                \n""", this.taskId, this.title, this.description, this.endDate, this.status);
    }
}
