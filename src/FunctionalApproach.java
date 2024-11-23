import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FunctionalApproach {
    public static void main(String[] args) {
        // java by default use OOP

        // functional behavior
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(9));

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(5, 9));
    }
}
