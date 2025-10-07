package academy.devjojo.maratonajava.javacore.Csobrecargametodos.Teste;

import academy.devjojo.maratonajava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Tv", 10);
        anime.init("Naruto", "Tv", 10, "Ação");
        anime.imprime();
    }
}
