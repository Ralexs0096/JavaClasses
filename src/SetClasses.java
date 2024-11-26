import java.util.LinkedHashSet;
import java.util.Set;

public class SetClasses {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(12);
        linkedHashSet.add(56);
        linkedHashSet.add(78);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(12);
        // the order is preserved

        linkedHashSet.forEach(System.out::println);
    }
}
