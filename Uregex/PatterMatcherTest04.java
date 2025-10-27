 package academy.devjojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {
        // regex é uma Linguagem que usa metaCaracteres para encontrar padrões no texto.
        // \d = Todos os digitos numericos.
        // \D tudo o que não for digito
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo o que não for caractere de palavra
        // [] são usados para criar uma classe de caracteres, ou seja, definem um conjunto de caracteres dos quais você deseja encontrar qualquer um deles em uma determinada posição da string
        // quantificadores são caracteres que te dão poder em pegar determinada expressão baseado no que o metacaracter representa
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // ()
        // $
        // {n,m} de n até m
        String regex = "([a-zA-Z-0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])";
        String texto = "yago@gmail.com, 123das@gmail.com, #@!zoro@gmail.com, teste@gmail.com, sakura@gmail.com";
    //  String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789" );
        System.out.println("Regex: " +regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+ matcher.group()+ "\n");
        }

    }


}
