package academy.devjojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Yago";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length()); // retorna o tamanho, diferente do array q é um atributo, o lenght da string é um metodo;
        System.out.println(nome.replace("o", "a")); // remove caracter especifico
        System.out.println(numeros.substring(0,2));
        System.out.println(nome.trim()); // remove espaços de caracter em branco
    }
}
