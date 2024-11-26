import java.util.LinkedHashSet;
import java.util.Set;

public class SetClasses {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Pear");
        // the order is preserved

        linkedHashSet.forEach(System.out::println);
    }
}
