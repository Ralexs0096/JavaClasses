import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalApproach {
    public static void main(String[] args) {
        // java by default use OOP

        // functional behavior
        Consumer<Integer> printNumber = num -> System.out.println(num);

        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println(randomNumber.get());
    }

//    static void printMessage(String message) {
//        System.out.println(message);
//    }
}
