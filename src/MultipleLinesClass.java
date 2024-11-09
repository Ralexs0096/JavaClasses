import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MultipleLinesClass {
    public static void main(String[] args) {
        // to delete an existing file. Don't require a try/catch statement
           File newFile = new File("test.txt");
           newFile.delete();
    }
}
