import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        /**
         * Primitives data types:
         *
         * int, double, char, short, float, byte, long, boolean
         *
         * Non-primitives:
         *
         * Object - (you have to create them)
         * String
         */

        /** Primitive --------- Wrapper
         * byte    -----   Byte
         * short   -----   Short
         * int     -----   Integer
         * long    -----   Long
         * double  -----   Double
         * float   -----   Float
         * boolean -----   Boolean
         * char    -----   Character
         */

        // not allowed
//        ArrayList<int> myNumbers = new ArrayList<int>();

//        var myNumbers = new ArrayList<Integer>();
        ArrayList<Integer> myNumbers = new ArrayList<>();

        // Primitives types
//        byte age = 5;
//        int myInt = 1232342334;

        Byte age = 5;
        Integer myInt = 1232342334;
        // reference: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        Character myChar = 64;

        System.out.println(age);
        System.out.println(myInt);
        System.out.println(myChar);

        Integer myNum = 100;
        Double myDouble = 74.56d;
        Float myFloat = 78.45f;

        String myStringConverted = myNum.toString();
        System.out.println(myStringConverted.length());
        System.out.println(myDouble.floatValue());
        System.out.println(myFloat.floatValue());
    }
}
