import java.util.HashSet;
import java.util.Set;

public class SetClasses {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Mango");
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Pear");
        hashSet.add("Cherry");
        // the order can change

        hashSet.forEach(System.out::println);
    }
}
