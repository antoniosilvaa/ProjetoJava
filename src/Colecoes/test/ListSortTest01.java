package Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("One Piece");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }

    }
}
