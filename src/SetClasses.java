import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetClasses {
    public static void main(String[] args) {
        // data structure
        // unique values
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Mango");
        hashSet.add("Mango");
        hashSet.add("Mango");
        hashSet.add("Mango");

        System.out.println("HashSet: " + hashSet);
        hashSet.forEach(System.out::println);

    }
}
