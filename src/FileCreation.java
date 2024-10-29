import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileCreation {
    public static void main(String[] args) {
        // file system
//        Input / Output

       try {
           File myFile = new File("/Users/ralexs/Desktop/Dev/nahum.txt");
           myFile.createNewFile();

           if(myFile.exists()){
               System.out.println("File already exists");

               FileWriter myWriter = new FileWriter("/Users/ralexs/Desktop/Dev/nahum.txt");
               myWriter.write("Files in java might be tricky, but it is fun enough!");
               myWriter.close();
               System.out.println("Successfully wrote to the file");
           } else {
            System.out.println("File created " + myFile.getName());
           }
       } catch (IOException e){
           System.out.println("File not created");
           e.printStackTrace();
       }
    }
}
