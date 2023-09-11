package Book8.Chapter1;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File f =new File("C:\\Users\\ghost\\IdeaProjects\\JavaGroupG\\src\\Book8\\Chapter1");
//        if (f.exists()) {
//            System.out.println
//                    ("Does exist!");
//        }

//        File f =new File("C:\\Users\\ghost\\IdeaProjects2");
//        try {
//            if (f.createNewFile()) {
//                System.out.println
//                        ("File created!");
//            }else {
//                System.out.println("file could not be created");
//            }
//        }catch (Exception e){
//            System.out.println("error creating file " +e);
//        }

//        File dir =new File("C:\\Users\\ghost\\IdeaProjects\\JavaGroupG\\src");
//        if (dir.isDirectory()){
//            File[] files = dir.listFiles();
//            for (File f :files ){
////                if (f.isFile() && !f.isHidden()) {
////                    System.out.println(f.getName());
////                }
//                System.out.println(f.getName());


//                File r = new File("C:\\Users\\ghost\\HelloApp.txt");
//                if (r.renameTo(new File("C:\\Users\\ghost\\HelloApp5.txt"))){
//                    System.out.println("renamed");
//                }else {
//                    System.out.println("renaming failed!");
//                }
        File f = new File("C:\\Users\\ghost\\IdeaProjects2");
        if (f.delete())
            System.out.println("File deleted.");
        else
            System.out.println("File not deleted.");

            }
        }




