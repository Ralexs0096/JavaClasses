import java.util.ArrayList;
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
//        A HashSet is a collection of items where every item is `unique`

//        HashSet<String> cars = new HashSet<String>();
        var cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        var result = cars.contains("mazda"); // case sensitive
        System.out.println(result);

        cars.remove("Volvo"); // case sensitive

        for (String i : cars) { // iterator
            System.out.println(i);
        }

//        cars.clear(); // remove all the elements
//        System.out.println(cars);
    }
}
