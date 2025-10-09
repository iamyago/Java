package academy.devjojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    public static void main(String[] args) {
        // regex é uma Linguagem que usa metaCaracteres para encontrar padrões no texto.
        String regex = "ab";
        // String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " +texto2);
        System.out.println("indice: 0123456789" );
        System.out.println("Regex: " +regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" ");
        }


    }

}
