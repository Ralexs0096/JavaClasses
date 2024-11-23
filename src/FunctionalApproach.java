import java.util.function.Consumer;

public class FunctionalApproach {
    public static void main(String[] args) {
        // java by default use OOP

        // functional behavior
        Consumer<String> printMessage = message -> System.out.println(message);

        printMessage.accept("Hello buddy");
    }

//    static void printMessage(String message) {
//        System.out.println(message);
//    }
}
