package Book8.Chapter1;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {

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


        Path p =  Paths.get("C:\\");
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(p,"*.txt");
            for(Path entry: stream){
                System.out.println(entry);
            }
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}
