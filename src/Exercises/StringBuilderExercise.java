package Exercises;

public class StringBuilderExercise {
    public static void main(String[] args) {
        /**
         * Exercise 1:
         *
         * Create a StringBuilder object.
         * Append the following strings in this order: "Java", " ", "is", " ", "fun".
         * Convert the StringBuilder to a string and print it.
         */

        var myText = new StringBuilder();

        myText.append("Java");
        myText.append(" ");
        myText.append("is");
        myText.append(" ");
        myText.append("fun");

        String myTextString = myText.toString();
        System.out.println(myTextString);

        /**
         * Exercise 2:
         *
         * Create a StringBuilder with the initial string "I love coding in Java".
         * Use StringBuilder methods to replace "Java" with "Python".
         * Print the updated string.
         *
         */

        var initialText = new StringBuilder("I love coding in Java");
        initialText.replace(17, 21, "Python");

        System.out.println(initialText);

        /**
         * Exercise 3:
         *
         * Create a StringBuilder object with the string "Java Programming".
         * Use StringBuilder methods to reverse the string and print the result.
         *
         */

        var javaProgrammingText = new StringBuilder("Java Programming");
        javaProgrammingText.reverse();

        System.out.println(javaProgrammingText);

        /**
         * Exercise 4:
         *
         * Create a StringBuilder object with a string "I am learning".
         * Insert the word "currently" between "am" and "learning".
         * Print the modified string.
         *
         */

        var iAmLearningText = new StringBuilder("I am learning");

        iAmLearningText.insert(5, "currently ");

        System.out.println(iAmLearningText);

        /**
         * Exercise 5:
         *
         * Create a StringBuilder with the string "Welcome to the world of Java".
         * Remove the word "Java" and replace it with "Programming".
         * Print the final result.
         */

        var myStr = new StringBuilder("Welcome to the world of Java");

        myStr.replace(24, 29, "Programming");

        System.out.println(myStr);
    }
}
