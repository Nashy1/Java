package Book2.Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException2 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String name) {
        try {
            FileInputStream s = new FileInputStream(name);
        }
        catch (FileNotFoundException error) {
            System.out.println("File not Found");
        }
    }
}
