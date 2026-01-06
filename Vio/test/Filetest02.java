package academy.devjojo.maratonajava.javacore.Vio.test;

import java.io.File;

public class Filetest02 {
    public static void main(String[] args) {
        File filediretorio = new File("pasta");
        boolean mkdir = filediretorio.mkdir();
        System.out.println(mkdir);
    }
}
