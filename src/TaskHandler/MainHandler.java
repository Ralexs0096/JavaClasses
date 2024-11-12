package TaskHandler;

import java.util.Date;

public class MainHandler {
    public static void main(String[] args) {
        String filePath = "myTasks-nahum-test.txt";
        var taskHandler = new TaskHandler(filePath);

        var menu = new Menus();
        System.out.println("Welcome to your task System!");

        int selection = menu.mainMenu();
        switch (selection) {
            case 1: // create task
                var taskToCreate = menu.createTaskMenu();
                taskHandler.createTask(taskToCreate.get(0), taskToCreate.get(1), new Date());
                break;
            case 2: // list all task
                var tasks = taskHandler.listAllTask();
                tasks.forEach(System.out::println);
                break;
            default:
                break;
        }
    }
}
