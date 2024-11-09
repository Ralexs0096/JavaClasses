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

            // [0,1,2...]

            for (int i = 0; i < lines.size(); i++) {
                if( lines.get(i).contains("comen trigo") ) {
                    lines.set(i, lines.get(i).replace("comen trigo", "Java is great!"));
                }
            }

            // override the file with the new value
            Files.write(pathFile, lines);
            System.out.println("File updated successfully");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
