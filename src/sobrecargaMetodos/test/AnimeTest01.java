package sobrecargaMetodos.test;

import sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.Init("Akudama drive", "Tv", 18, "Ação");
        anime.imprime();
    }
}
