package Colecoes.test;

import Colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(23, "One piece", 2L));
        mangas.add(new Manga(0, "Attack on titan", 3L));
        mangas.add(new Manga(0, "Dragon ball Z", 1L));
        mangas.add(new Manga(12, "Pokemon", 4L));

        Iterator<Manga> iterator = mangas.iterator();

//        while (iterator.hasNext()){
//            Manga next = iterator.next();
//            if (next.getQuantidade() == 0){
//                iterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
