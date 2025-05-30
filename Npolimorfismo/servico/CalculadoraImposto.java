package academy.devjojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoPc(Computador computador){
        System.out.println("Relatorio imposto do pc");
        double imposto = computador.calcularImposto();
        System.out.println("computador:" + computador.getNome());
        System.out.println("valor do pc e:" + computador.getValor());
        System.out.println("imposto a ser pago: " + imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("tomate:" + tomate.getNome());
        System.out.println("valor do tomate e:" + tomate.getValor());
        System.out.println("imposto a ser pago: " + imposto);
    }
}
