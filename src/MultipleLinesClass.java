import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MultipleLinesClass {
    public static void main(String[] args) {
       Path filePath = Paths.get("Table-5.txt");

       try {
           Files.delete(filePath);
           System.out.println("File deleted");
       } catch (IOException e){
           System.err.println(e.getMessage());
       }

    }
}
