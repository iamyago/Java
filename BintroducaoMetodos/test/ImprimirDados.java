package academy.devjojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Funcionario;

public class ImprimirDados {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Yago";
        funcionario.salarios = new double[]{1200, 900, 2000};
        funcionario.idade = "23";

        funcionario.imprime();

    }
}
