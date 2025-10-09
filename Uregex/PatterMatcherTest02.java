package academy.devjojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // regex é uma Linguagem que usa metaCaracteres para encontrar padrões no texto.
        // \d = Todos os digitos numericos.
        // \D tudo o que não for digito
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo o que não for caractere de palavra
        String regex = "\\d";
        // String texto = "abaaba";
        String texto2 = "@#hhj2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " +texto2);
        System.out.println("indice: 0123456789" );
        System.out.println("Regex: " +regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+ matcher.group()+ "\n");
        }    }

}
