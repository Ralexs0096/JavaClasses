package dev;

public class StringBuilderClass {

    public static void main(String[] args) {

        /**
         *  *** Why we use StringBuilder?
         *
         *  when working with `Strings`, and doing a lot of text modifications
         *  or concatenations, using `String` may not be efficient.
         *  This is because each time the text is modified a new object is created,
         *  and this consumes memory and processing time.
         *
         *  in the other hand, `StringBuilder` can modify the same object multiple times
         *  without create a new object on memory.
         *
         *  *** Main features of `StringBuilder`:
         *
         *  * Mutable:
         *  - I could change without creating a new object:
         *
         *  * more efficient for modifications:
         *  - It's faster for concatenation and modification operations than `String`
         *
         *  * It's not Synchronized:
         *  - Unlike StringBuffer (another similar class), StringBuilder is not synchronized,
         *  which makes it faster but not thread-safe. If safety is required in a
         *  multithreaded environment, StringBuffer should be used.
         */

        /**
         * `StringBuilder` Constructors
         */

        // Empty constructor
        // creates an initial StringBuilder with an initial capacity of 16 characters
        StringBuilder sb = new StringBuilder();

        // Constructor with Capacity
        StringBuilder sb2 = new StringBuilder(50);

        // Constructor with initial String
        StringBuilder sb3 = new StringBuilder("Hello");

        /** **************** Main Methods **************** */

        sb3.append(" world");

        sb3.insert(5, "Java");

        sb3.delete(0, 5);

        sb3.deleteCharAt(0);

        sb3.replace(0,5, "Hi");

        sb3.reverse();

        sb3.length(); // prints the length
        sb3.capacity(); // prints the internal capacity

        sb.toString(); // convert the `StringBuilder` to a `String`

        /** **************** Example **************** */
        
        StringBuilder text = new StringBuilder("Hello");
        
        text.append(" World");
        System.out.println(text);

        text.insert(6, "Beautiful ");
        System.out.println(text);

        text.delete(6, 16);
        System.out.println(text);

        text.replace(6, 11, "Java");
        System.out.println(text);

        text.reverse();
        System.out.println(text);

        String result = text.toString();
        System.out.println("Final result: " + result);
    }

}
