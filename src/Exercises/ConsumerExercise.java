package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExercise {
    public static void main(String[] args) {
        /**
         * Exercise 1:
         *
         * Create a Consumer<String> that takes a string and prints it in uppercase.
         * Use the accept() method to test it with the string "hello".
         *
         */

        Consumer<String> convertToUppercase = text -> System.out.println(text.toUpperCase());
        convertToUppercase.accept("hello");

        /**
         * Exercise 2:
         *
         * Write a Consumer<Integer> that squares the given integer and prints the result.
         * Test it with a value of your choice.
         *
         */

        Consumer<Integer> squaresInt = num -> System.out.println(Math.pow(num, 2));
        squaresInt.accept(4);

        /**
         * Exercise 3:
         *
         * Create a list of integers and a Consumer<List<Integer>> that prints each integer in the list.
         * Use forEach() to apply the consumer to the list.
         *
         */

        var myIntegers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        Consumer<List<Integer>> myConsumer = list -> list.forEach(System.out::println);

        myConsumer.accept(myIntegers);

        /**
         * Exercise 4:
         *
         * Write a Consumer<StringBuilder> that appends " World!" to the given StringBuilder.
         * Test it with "Hello" as the initial value.
         *
         */

        var myText = new StringBuilder("Hello");
        Consumer<StringBuilder> myStringBuilderConsumer = str -> str.append(" World!");

        myStringBuilderConsumer.accept(myText);
        System.out.println(myText);

        /**
         * Exercise 5:
         *
         * Create a Consumer<Integer> that prints whether the given integer is odd or even.
         * Test it with different integers.
         */

        Consumer<Integer> isOddOrEven = num -> {
            if(num % 2 == 0 ){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        };

        isOddOrEven.accept(10);
        isOddOrEven.accept(19);
        isOddOrEven.accept(57);

    }
}
