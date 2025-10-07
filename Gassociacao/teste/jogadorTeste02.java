package academy.devjojo.maratonajava.javacore.Gassociacao.teste;

import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.Time;
import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.jogador;

public class jogadorTeste02 {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("Memphis");
        Time time = new Time("Corinthians");

        jogador1.imprime();
    }
}
