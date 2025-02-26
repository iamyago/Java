package academy.devjojo.maratonajava.javacore.Dconstrutores.Teste;

import academy.devjojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Goku", " asda");
        Anime anime2 = new Anime();
        //anime.init("Naruto", "Tv", 10, "Ação");
        anime.imprime();
        anime2.imprime();
    }
}
