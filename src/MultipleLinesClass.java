import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleLinesClass {
    public static void main(String[] args) {
        /**
         * Please type a number (given number)
         *
         * generate table of the given number
         *
         * -- print the table on the console (first commit)
         * -- create a new file with the name: "Table-<given number>" (second commit)
         * -- Write the table on the created table-given-number file (third commit)
         *
         * note: the table contains the values from 1 to 12
         *
         *    7 * 1 = 7
         *    7 * 2 = 14
         *    7 * 3 = 21
         *    ...
         *    7 * 12 = 84
         */

        var keyboard = new Scanner(System.in);
        System.out.println("Hey! Type a number: ");
        int givenNumber = keyboard.nextInt();

        var tableValues = new ArrayList<String>();

        String tableName = "Table-" + givenNumber + ".txt";
        Path filePath = Paths.get(tableName);

        for (int i = 1; i < 13; i++) {
            tableValues.add(givenNumber + " * " + i + " = " + (givenNumber * i));
            System.out.println(givenNumber + " * " + i + " = " + (givenNumber * i));
        }

        tableValues.forEach();

        try {
            Files.write(filePath, tableValues);
            System.out.println("File Created");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
