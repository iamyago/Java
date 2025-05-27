package academy.devjojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devjojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class Funcionarioteste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("naruto", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("ginka", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
