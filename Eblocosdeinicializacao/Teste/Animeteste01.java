package academy.devjojo.maratonajava.javacore.Eblocosdeinicializacao.Teste;

import academy.devjojo.maratonajava.javacore.Eblocosdeinicializacao.Dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
   // Quando um método é static, eu consigo chamá-lo diretamente pela Classe, sem precisar de um objeto. Quando um método não é static, eu preciso primeiro instanciar a classe (criar um objeto) para depois chamar o método a partir desse objeto."
    }
}
