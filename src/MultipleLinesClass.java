import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MultipleLinesClass {
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        System.out.println("Type a message: ");
        String message = keyboard.nextLine();

        try (FileWriter fileWriter = new  FileWriter("test.txt", true)) {

           fileWriter.write("\n" + message);
            System.out.println("File Updated with message: " + message);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
