package Book2.Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException5 {
    public static void main(String[] args)  {
    try {
        openFile("C:\test.txt");
    } catch (FileNotFoundException e){
        System.out.println("First " + e);
    }catch (Exception e) {
        System.out.println(e);
    }



    }

    public static void openFile(String file) throws FileNotFoundException{


            FileInputStream s = new FileInputStream(file);

    }
}
