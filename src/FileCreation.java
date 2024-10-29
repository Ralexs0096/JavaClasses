import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCreation {
    public static void main(String[] args) {
        // file system
//        Input / Output

       try {
           File myFile = new File("/Users/ralexs/Desktop/Dev/nahum.txt");
           myFile.createNewFile();

           if(myFile.exists()){
               System.out.println("File already exists");

               System.out.println(myFile.getName());
               System.out.println(myFile.getAbsolutePath());
               System.out.println(myFile.canWrite());
               System.out.println(myFile.canRead());
               System.out.println(myFile.length());
           } else {
            System.out.println("File created " + myFile.getName());
           }
       } catch (IOException e){
           System.out.println("File not created");
           e.printStackTrace();
       }
    }
}
