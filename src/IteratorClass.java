import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorClass {
    public static void main(String[] args) {
        var cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Hyundai");

        // for each
//        cars.forEach((car) -> System.out.println(car));

        // Get the iterator
        // Angle braces <>
        Iterator<String> it = cars.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());


        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("EXECUTION END");

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        var numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(12);
        numbers.add(34);
        numbers.add(23);

        Iterator<Integer> numIt = numbers.iterator();

        while (numIt.hasNext()){
            Integer i = numIt.next();
            if(i < 15){
                numIt.remove();
            }
        }

        System.out.println(numbers);
    };
}
