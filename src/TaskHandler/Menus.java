package TaskHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {
    public int mainMenu() {
        Scanner keyboard = new Scanner(System.in);
        String[] menuOptions = {
                "1. Create a task",
                "2. List all tasks",
                "3. Update Task",
                "4. Complete task",
                "5. Exit"
        };

        for (String option : menuOptions) {
            System.out.println(option);
        }
        int selection = keyboard.nextInt();
        return selection;
    }

    public List<String> createTaskMenu() {
        var taskData = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please provide the Task details: ");

        System.out.println("Title: ");
        taskData.add(keyboard.nextLine());

        System.out.println("Description: ");
        taskData.add(keyboard.nextLine());

        return taskData;
    }
}
