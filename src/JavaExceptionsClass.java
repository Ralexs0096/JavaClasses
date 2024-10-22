public class JavaExceptionsClass {
    public static void main(String[] args) {
//        // try-catch structure
//         try {
//             // Block of code to try
//         } catch (Exception e) {
//             // Block of code to handle errors
//         }

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        } finally {
            System.out.println("the 'try catch' is finished");
        }

        // THROW - keyword
//        int age = 12;
//        if( age < 18) {
//            throw new ArithmeticException("Access denied");
//        } else {
//            System.out.println("Access granted");
//        }
    }
}
