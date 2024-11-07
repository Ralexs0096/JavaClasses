package Exercises;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class MultipleLinesSolution {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to get the Table");
        int num = scanner.nextInt();

        System.out.println("Multiplication table for " + num + " :");

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        try (FileWriter writer = new FileWriter("Table-" + num + ".txt")) {
            for (int i = 1; i <= 12; i++) {
                writer.write(num + " * " + i + " = " + (num * i) + "\n");
            }
            System.out.println("Multiplication table has been written to Table-" + num + ".txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
