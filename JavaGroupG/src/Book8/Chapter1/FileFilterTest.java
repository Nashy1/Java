package Book8.Chapter1;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
    public static void main(String[] args) {
        FileFilterTest tc = new FileFilterTest();
        System.out.println("You chose this file:" + tc.getFile());
    }

   public File getFile() {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new JavaFilter());
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new JavaFilter());
        int result = fc.showOpenDialog(null);
        File file = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }  return file;

    }
}

 class JavaFilter extends javax.swing.filechooser.FileFilter{
     public boolean accept(File f) {
         if (f.isDirectory()) {
             return  true;
         }
         String name = f.getName();
         if (name.matches(".*\\.java")) {
             return true;
         } else {
             return false;
         }
     }

     @Override
     public String getDescription() {
         return "Java Files (*.java)";
     }

 }
