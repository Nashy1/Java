package Book8.Chapter1;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p =  Paths.get("C:\\Users\\ghost\\OneDrive\\Documents\\HelloApp7.java");
//        if(!Files.exists(p)){
//            System.out.println("File exists");
//        }


//        try{
//            Files.createFile(p);
//            System.out.println("File created");
//        }catch (Exception e){
//            System.out.println("File not created " +e);
////            e.printStackTrace();
//        }



        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(p);
            for(Path entry: stream){
                System.out.println(entry.toString());
            }
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}
