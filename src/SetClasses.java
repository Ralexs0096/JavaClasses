
import java.util.Set;
import java.util.TreeSet;

public class SetClasses {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("ABc");
        treeSet.add("Cherry");
        // the order is lexicographic

        treeSet.forEach(System.out::println);
    }
}
