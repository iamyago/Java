package academy.devjojo.maratonajava.javacore.Eblocosdeinicializacao.Teste;

import academy.devjojo.maratonajava.javacore.Eblocosdeinicializacao.Dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
