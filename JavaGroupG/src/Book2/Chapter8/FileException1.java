package Book2.Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException1 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String name) {
        try {
            FileInputStream s = new FileInputStream(name);
        }catch (FileNotFoundException e){
            System.out.println("File not Found " + e);
        }

    }
}
