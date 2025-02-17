package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Yago");
        pessoa.setIdade(18);
        pessoa.imprime();
    }
}
