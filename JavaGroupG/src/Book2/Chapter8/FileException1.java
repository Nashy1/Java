package Book2.Chapter8;

import java.io.FileInputStream;

public class FileException1 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }
    public static void openFile(String name){
        FileInputStream s = new FileInputStream(name);
    }
}
