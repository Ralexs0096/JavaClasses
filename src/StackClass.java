import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        var laundry = new Stack<String>();

        // push is used to add new values to the stack
        laundry.push("Dish 1");
        laundry.push("Dish 2");
        laundry.push("Dish 3");

        // Pop removes the last added item
        laundry.pop();

        boolean isLaundryEmpty = laundry.isEmpty();

        System.out.println(isLaundryEmpty);
    }
}
