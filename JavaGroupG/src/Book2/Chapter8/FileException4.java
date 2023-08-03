package Book2.Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException4 {
    public static void main(String[] args)  {
    try {
        openFile("C:\test.txt");
    } catch (Exception e){

    }


    }

    public static void openFile(String file) throws FileNotFoundException{


            FileInputStream s = new FileInputStream(file);

    }
}
