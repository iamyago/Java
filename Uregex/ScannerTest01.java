package academy.devjojo.maratonajava.javacore.Uregex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";
        String[] split = texto.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

    }

}
