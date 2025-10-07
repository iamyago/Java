package academy.devjojo.maratonajava.javacore.Gassociacao.teste;

import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.professor;

public class escolaTeste01 {
    public static void main(String[] args) {
        professor professor = new professor("joao");
        professor[] professores = {professor};
        Escola escola = new Escola("carrossel", professores);
        escola.imprime();
    }
}
