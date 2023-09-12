package Book8.Chapter1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorDemo {
    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");
        MyFileVisitor visitor = new MyFileVisitor();
        try {
            Files.walkFileTree(start,visitor);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path>{
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }
        public FileVisitResult visitFileFailed(Path file,IOException e){
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
//        public FileVisitResult preVisitDirectoryFailed(Path dir, BasicFileAttributes attr){
//            System.out.println(dir.toString() + " COULD NOT ACCESS!");
//            return FileVisitResult.CONTINUE;
//        }
    }
}
