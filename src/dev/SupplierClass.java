package dev;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierClass {

    /**
     * Supplier<T> is a functional interface in Java that belongs to the java.util.function package.
     * It is used to represent a function that takes no arguments and returns a result of generic type T.
     * The Supplier interface is part of the functional interfaces introduced in Java 8,
     * and its main use is as a result source.
     */

    // Key features of Supplier:

    /**
     * * Receives no parameters:
     * - Unlike other functional interfaces such as Function, Supplier does not receive any arguments.
     *
     * * Returns a value:
     * - The get() method of the Supplier interface returns a value of the specified type.
     *   This value can be calculated, created or simply provided from some source, such as a database or a file.
     *
     * * Functional interface:
     * - As a functional interface, Supplier can be implemented using a lambda expression or a reference to a method.
     */

    // Its definition:

    /**
     * @FunctionalInterface
     * public interface Supplier<T> {
     *     T get();
     * }
     */

    /** ***************** Example ***************** */
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello world";

        System.out.println(stringSupplier.get()); // invoke the supplier using the `get()` method

        // using Supplier with lambda expression
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        System.out.println(randomNumberSupplier.get());

        // using method reference
        Supplier<Double> randomSupplier = Math::random;

        System.out.println(randomSupplier.get());

        // Supplier used on Optional API:

        Optional<String> optional = Optional.empty();

        String result = optional.orElseGet(() -> "Default value");

        System.out.println(result);
    }
}
