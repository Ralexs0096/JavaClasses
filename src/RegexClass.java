import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        // Regex -> Regular Expression

//        "Hola Nahum, como estas Nahum?"

        /**
         * Pattern Class - Defines a pattern (to be used in a search)
         * Matcher Class - Used to search for the pattern
         * PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
         */

        String textToSearch = "Hola Nahum, como estas? 0";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(textToSearch);
        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Match Found");
        }
        else {
            System.out.println("Match Not Found");
        }

        /**
         * Metacharacters
         *
         * |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
         * .	Find just one instance of any character
         * ^	Finds a match as the beginning of a string as in: ^Hello
         * $	Finds a match at the end of the string as in: World$
         * \d	Find a digit
         * \s	Find a whitespace character
         * \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
         * \\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx
         */

        // Example of |
        String text1 = "I have a cat and a dog, but I don’t have a fish.";
        Pattern pattern1 = Pattern.compile("cat|dog|fish");
        Matcher matcher1 = pattern1.matcher(text1);
        System.out.println("Using '|':");
        while (matcher1.find()) {
            System.out.println(matcher1.group()); // Finds any of the words "cat", "dog", or "fish"
        }

        // Example of .
        String text2 = "Cat mat bat rat";
        Pattern pattern2 = Pattern.compile(".at");
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("\nUsing '.':");
        while (matcher2.find()) {
            System.out.println(matcher2.group()); // Finds any word ending in "at"
        }

        // Example of ^
        String text3 = "Hello world";
        Pattern pattern3 = Pattern.compile("^Hello");
        Matcher matcher3 = pattern3.matcher(text3);
        System.out.println("\nUsing '^':");
        if (matcher3.find()) {
            System.out.println(matcher3.group()); // Finds "Hello" if it is at the start
        }

        // Example of $
        String text4 = "Hello world";
        Pattern pattern4 = Pattern.compile("world$");
        Matcher matcher4 = pattern4.matcher(text4);
        System.out.println("\nUsing '$':");
        if (matcher4.find()) {
            System.out.println(matcher4.group()); // Finds "world" if it is at the end
        }

        // Example of \d
        String text5 = "There are 15 cats and 7 dogs.";
        Pattern pattern5 = Pattern.compile("\\d+");
        Matcher matcher5 = pattern5.matcher(text5);
        System.out.println("\nUsing '\\d':");
        while (matcher5.find()) {
            System.out.println(matcher5.group()); // Finds each number in the text
        }

        // Example of \s
        String text6 = "Text with spaces.";
        Pattern pattern6 = Pattern.compile("\\s");
        Matcher matcher6 = pattern6.matcher(text6);
        System.out.println("\nUsing '\\s':");
        while (matcher6.find()) {
            System.out.println("Whitespace found at position: " + matcher6.start()); // Finds each whitespace
        }

        // Example of \b
        String text7 = "Java is fun. Programming in Java is great.";
        Pattern pattern7 = Pattern.compile("\\bJava\\b");
        Matcher matcher7 = pattern7.matcher(text7);
        System.out.println("\nUsing '\\b':");
        while (matcher7.find()) {
            System.out.println(matcher7.group() + " at position " + matcher7.start()); // Finds "Java" as a separate word
        }

        // Example of \\uxxxx
        String text8 = "Here is the letter: \u0041"; // \u0041 is 'A' in Unicode
        Pattern pattern8 = Pattern.compile("\\u0041");
        Matcher matcher8 = pattern8.matcher(text8);
        System.out.println("\nUsing '\\u0041':");
        if (matcher8.find()) {
            System.out.println("Letter found: " + matcher8.group()); // Finds the Unicode character 'A'
        }
    }
}
