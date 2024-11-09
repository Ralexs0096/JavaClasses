import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MultipleLinesClass {
    public static void main(String[] args) {
        Path pathFile = Paths.get("test.txt");
        try {
            List<String> lines = Files.readAllLines(pathFile);

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
