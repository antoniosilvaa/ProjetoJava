package Colecoes.test;

import Colecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangasSet = new HashSet<>();
        mangasSet.add(new Manga(23, "One piece", 2L));
        mangasSet.add(new Manga(0, "Attack on titan", 3L));
        mangasSet.add(new Manga(0, "Dragon ball Z", 1L));
        mangasSet.add(new Manga(12, "Pokemon", 4L));
        mangasSet.add(new Manga(12, "Pokemon", 4L));
        for (Manga manga : mangasSet){
            System.out.println(manga);
        }
    }
}
