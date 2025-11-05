package academy.devjojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Filetest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("Created " + newFile);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is file" + file.isFile());
            System.out.println("last modify" + new Date(file.lastModified()));
            boolean exists = file.exists();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
