import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MultipleLinesClass {
    public static void main(String[] args) {
        String filePath = "/Users/ralexs/Desktop/Dev/multiple.txt";
        String[] lines = {
                "First Line of the file",
                "Second Line of the file",
                "Third Line of the file",
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines){
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
