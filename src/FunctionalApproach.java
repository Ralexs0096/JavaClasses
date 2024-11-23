import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalApproach {
    public static void main(String[] args) {
        // java by default use OOP

        // functional behavior
        Function<String, Integer> stringLength = value -> value.length();

        System.out.println(stringLength.apply("Nahum"));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(2, 5));
    }
}
