import java.util.function.BiConsumer;

public class FunctionalApproach {
    public static void main(String[] args) {
        // java by default use OOP

        // functional behavior
        BiConsumer<String, String> printMessage =
                (message, name) ->
                        System.out.println(String.format("""
                                %s %s
                                """, message, name));

        printMessage.accept("Hey", "Nahum");
    }

//    static void printMessage(String message) {
//        System.out.println(message);
//    }
}
