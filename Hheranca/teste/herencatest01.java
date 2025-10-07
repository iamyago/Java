package academy.devjojo.maratonajava.javacore.Hheranca.teste;

import academy.devjojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Funcionario;
import academy.devjojo.maratonajava.javacore.Hheranca.dominio.Pessoa;
import academy.devjojo.maratonajava.javacore.Hheranca.dominio.endereco;
import academy.devjojo.maratonajava.javacore.Hheranca.dominio.funcionario;

public class herencatest01 {
    public static void main(String[] args) {
        endereco endereco = new endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12324");
        Pessoa pessoa = new Pessoa("Naruto");
        pessoa.setCpf("12123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        funcionario funcionario = new funcionario("Naruto");
        funcionario.setCpf("12312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------");
        funcionario.imprime();
    }
}
