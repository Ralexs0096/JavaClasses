package dev;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {
        /**
         * It's a concise and legible way to use the lambda functions
         *
         * there are three method references:
         *
         * 1. Reference to a static method:
         *
         *  Class::method
         *
         *  2. Reference to an instance method:
         *
         *  instance::method or Class::methodInstance
         *
         *  3. Constructor Reference:
         *
         *  Class::new
         */

        /**
         * General Syntax:
         *
         * ClassName::methodName
         */


        /** ********** Static Method Reference ********** */

        // using lambda expression
        Consumer<String> lambdaPrinter = s -> StaticMethodReference.printMessage(s);
        lambdaPrinter.accept("Hello using Lambda! - SMR");

        // using method reference
        Consumer<String> methodRefPrinter = StaticMethodReference::printMessage;
        methodRefPrinter.accept("Hello using Method Reference - SMR");



        /** ********** Instance Reference (Particular Object) ********** */
        var instance = new InstanceMethodReference();

        // using lambda expression
        Consumer<String> lambdaPrinter2 = s -> instance.printUpperCase(s);
        lambdaPrinter2.accept("Hello using lambda - IR");

        Consumer<String> methodRefPrinter2 = instance::printUpperCase;
        methodRefPrinter2.accept("Hello using method reference - IR");



        /** ********** Instance Reference (Arbitrary Object) ********** */

        List<String> names = Arrays.asList("Juan", "Nahum", "Alex");

        // using lambda expressions
        names.forEach(name -> System.out.println(name));

        // using method reference (of an instance)
        names.forEach(System.out::println);



        /** ********** Constructor Reference ********** */


    }
}

class StaticMethodReference {
    public static void printMessage(String message){
        System.out.println(message);
    }
}

class InstanceMethodReference {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}