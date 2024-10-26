
package Exercises;

public class StringExercises {
    public static void main(String[] args) {
        /**
         * Challenge 1: Word Counter
         * Create a program that takes a sentence as input and counts the number
         * of words in it. The sentence may contain multiple spaces between words.
         *
         * Your task is to ensure the word count is accurate.
         *
         * input:
         *
         * String frase = "Java es un lenguaje de programación poderoso";
         *
         * output: 7
         */

        String sentence = "Java is a powerful programming language";
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String sentence) {
        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s");

        return words.length;

/////////////////////////////////////////////////////////////////////////////////////////////////


        /**
         * Challenge 2: Vowel Replacer
         * Write a program that replaces all the vowels in a given string
         * with a special character of your choice.
         *
         * Ensure that the program works with both uppercase and lowercase vowels.
         *
         * input:
         *
         * String text = "Learning Java is fun";
         *
         * output: (example using *)
         *
         * L**rn*ng J*v* *s f*n
         */


//        String text = "Learning java is fun";
//        char character = '*';
//        String result = replaceVowels(text, character );
//        System.out.println("Original text : " + text);
//        System.out.println("Modified text : " + result);
//
//        }
//
//        public static String replaceVowels(String vowels, char replacement) {
//            return vowels.replaceAll("[aeiouAEIOU]", String.valueOf(replacement));
//        }
//        }

        //////////////////////////////////////////////////////////////////////////////////

        /**
         * Challenge 3: Palindrome Validator
         * Design a program that checks if a given string is a palindrome.
         * The program should ignore spaces, punctuation,
         * and capitalization when determining whether
         * the string reads the same forwards and backwards.
         *
         * input:
         *
         * String original = "A man a plan a canal Panama"
         *
         * output:
         *
         * It's a palindrome
         *
         * or
         *
         * It's not a palindrome
         */

//        String original = "A man a plan a canal Panama";
//
//        if (isPalindrome(original)){
//            System.out.println("It's a palindrome");
//        } else {
//            System.out.println("It's not a palindrome");
//        }}
//        public static boolean isPalindrome(String str) {
//
//            String normalText = str.replaceAll("[\\W_]", " ").toLowerCase();
//
//
//            String reversed = new StringBuilder(normalText).reverse().toString();
//
//            return normalText.equals(reversed);
        }
    }