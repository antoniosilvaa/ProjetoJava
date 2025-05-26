package Colecoes.test;

import Colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortMangaByNomeComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "One piece"));
        mangas.add(new Manga(2L, "Attack on titan"));
        mangas.add(new Manga(1L, "Dragon ball Z"));
        mangas.add(new Manga(6L, "Pokemon"));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("----------");

        Collections.sort(mangas);

        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("------------");
        mangas.sort(new SortMangaByNomeComparator());

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
