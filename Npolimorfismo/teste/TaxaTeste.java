package academy.devjojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TaxaTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("M4", 5000);
        Tomate tomate = new Tomate("tomate", 30);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
