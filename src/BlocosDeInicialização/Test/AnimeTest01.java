package BlocosDeInicialização.Test;


import BlocosDeInicialização.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio);
        }
        System.out.println(anime.getNome());

    }
}
