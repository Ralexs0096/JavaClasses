import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

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

        /** 1 ------------------------------------------------ */

        // using lambda expression
        Consumer<String> lambdaPrinter = text -> StaticMethodReference.printMessage(text);
        lambdaPrinter.accept("Hello using lambda! - SMR");

        // using method reference
        Consumer<String> methodRefPrinter = StaticMethodReference::printMessage;
        methodRefPrinter.accept("Hello using Method Reference - SMR");


        /** 2 ------------------------------------------------ */

        var instance = new InstanceMethodReference();

        Consumer<String> lambdaPrinter2 = text -> instance.printUpperCase(text);
        lambdaPrinter2.accept("Hello using Lambda - IR");

        Consumer<String> methodRefPrinter2 = instance::printUpperCase;
        methodRefPrinter2.accept("Hello using Method Reference - IR");


        /** 3 ------------------------------------------------ */
        List<String> names = Arrays.asList("Juan", "Nahum", "Alex");

        // lambda expression
        names.forEach(name -> System.out.println(name));

        // method reference
        names.forEach(System.out::println);

        // lambda expression
        Supplier<StringBuilder> lambdaSupplier = () -> new StringBuilder();
        var sb1 = lambdaSupplier.get();

        Supplier<StringBuilder> methodRefSupplier = StringBuilder::new;
        var sb2 = methodRefSupplier.get();

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