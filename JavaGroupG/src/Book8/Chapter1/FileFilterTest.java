package Book8.Chapter1;

import javax.swing.*;
import java.io.File;

public class FileFilterTest {
    public static void main(String[] args) {
//        FileChooserTest tc = new FileChooserTest();
        System.out.println("You chose this file:" + getFile());
    }

    static File getFile() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        File file = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }  return file;

    }
}
