import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaClass {
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public String greet(String name) {
        String saludo = "Hello " + name;
        return saludo;
    }

    // ************ Lambda equivalent ************
    // parameter -> expression

//    name -> "Hello" + name                        - greet method

//    (parameter1, parameter2) -> expression        - sum method


    // ************ Lambda more complex ************
    // (parameter1, parameter2) -> { code block }

    public static void main(String[] args) {

//       BiFunction<Integer, Integer, Integer> suma = (num1, num2) -> num1 + num2;

        Consumer log = value -> {
            System.out.println(value);
        };

        log.accept("Nahum is a java Crack!");

       var numbers = new ArrayList<Integer>(); // LVTI

        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(22);

        for (Integer num : numbers){
            log.accept(num);
//            System.out.println(num);
        }

//        numbers.forEach(System.out::println); // method reference

        // lambda expression
        numbers.forEach(log);

        // *********** Store the lambda function in a variable ***********
        var cars = new LinkedList<String>();

        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Kia");
        cars.add("Hyundai");

        cars.forEach(log);
    }
}
