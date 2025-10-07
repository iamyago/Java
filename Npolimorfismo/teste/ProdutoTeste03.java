package academy.devjojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("M4", 2000);
        Tomate tomate = new Tomate("americano", 20);
        tomate.setDataValidade("11/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
