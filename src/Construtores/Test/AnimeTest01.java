package Construtores.Test;

import Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hakudama", "Tv", 18, "Ação", "pixar");
        Anime anime1 = new Anime("one piece", "Tv", 18, "Ação", "holywood");
        anime.imprime();
        System.out.println("\n");
        anime1.imprime();
    }
}
