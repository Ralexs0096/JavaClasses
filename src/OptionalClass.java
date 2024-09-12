
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        // Optional value *******************

        String name = "Alex";
        Optional<String> opt = Optional.of(name);

        opt.ifPresent(name2 -> System.out.println(name2.length()));
        System.out.println(opt.isEmpty());

        // orElse *********************

        String nullName = "Alex";

        String result = Optional.ofNullable(nullName).orElse("Nahum");

        result.isEmpty();

        System.out.println(result);


        // orElseGet *********************

        String nullName2 = null;

        String result2 = Optional.ofNullable(nullName2).orElseGet(() -> "Nahum");

        System.out.println(result2);


    }
}
