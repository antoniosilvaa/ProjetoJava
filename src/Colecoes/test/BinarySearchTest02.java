package Colecoes.test;

import Colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "One piece"));
        mangas.add(new Manga(2L, "Attack on titan"));
        mangas.add(new Manga(1L, "Dragon ball Z"));
        mangas.add(new Manga(6L, "Pokemon"));

        Collections.sort(mangas);

        for (Manga manga : mangas){
            System.out.println(manga);
        }
       Manga MangaToSerarch =new Manga(6L, "Pokemon");
        System.out.println(Collections.binarySearch(mangas, MangaToSerarch));



    }
}
