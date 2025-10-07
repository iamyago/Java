package academy.devjojo.maratonajava.javacore.Qstring.test;

public class StringBuilder01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("devdojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Yago Erik");
        sb.append("Santiago");
        System.out.println(sb);
    }
}
