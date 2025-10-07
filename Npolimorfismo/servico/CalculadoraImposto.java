package academy.devjojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto (Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println(produto.getValor());
        System.out.println(produto.getNome());
        System.out.println(imposto);
        if (produto instanceof Tomate ){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
