package academy.devjojo.maratonajava.javacore.Gassociacao.teste;

import academy.devjojo.maratonajava.javacore.Gassociacao.dominio.jogador;

public class jogadorTeste01 {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("messi");
        jogador jogador2 = new jogador("neymar");
        jogador jogador3 = new jogador("romario");
        // jogador[] jogador = new jogador[]{jogador1, jogador2, jogador3};
        jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
