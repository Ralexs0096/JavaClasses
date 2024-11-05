import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MultipleLinesClass {
    public static void main(String[] args) {
        Path filePath = Paths.get("nahum.txt");
        List<String> lines = Arrays.asList(
                "First Line of the file",
                "Second Line of the file",
                "Third Line of the file"
        );

        try {
            Files.write(filePath, lines);
            System.out.println("File was wrote");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
