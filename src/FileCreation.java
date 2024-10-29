import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        // file system
//        Input / Output

       try {
           File myFile = new File("/Users/ralexs/Desktop/Dev/nahum.txt");
           myFile.createNewFile();
           System.out.println("File created " + myFile.getName());
       } catch (IOException e){
           System.out.println("File not created");
       }
    }
}
