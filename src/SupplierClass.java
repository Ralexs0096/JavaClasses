import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello World";

        System.out.println(stringSupplier.get());

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        System.out.println(randomNumberSupplier.get());

        Optional<String> optional = Optional.empty();

        String result = optional.orElseGet(() -> "Default Value");

        System.out.println(result);
    }
}
