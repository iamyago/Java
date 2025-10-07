package academy.devjojo.maratonajava.javacore.Gassociacao.teste;

import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.Time;
import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.jogador;

public class jogadorTeste03 {
    public static void main(String[] args) {
        Time time = new Time("Selecao");
        jogador jogador = new jogador("Neymar");
        jogador[] jogadores = {jogador};

        System.out.println("------jogador----");
        jogador.setTime(time);
        time.setJogadores(jogadores);
        jogador.imprime();
        System.out.println("------time----");
        time.imprime();
    }
}
