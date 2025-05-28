package Colecoes.test;

import Colecoes.domain.Manga;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Antonio", 1L);
        Consumidor consumidor2 = new Consumidor("Bia", 2L);

        Manga manga1 = new Manga(4L, "One piece");
        Manga manga2 = new Manga(2L, "Attack on titan");
        Manga manga3 = new Manga(1L, "Dragon ball Z");
        Manga manga4 = new Manga(6L, "Pokemon");
        Map<Consumidor, Manga> consultaManga = new LinkedHashMap<>();
        consultaManga.put(consumidor1, manga3);
        consultaManga.put(consumidor2, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consultaManga.entrySet()){
            System.out.println(entry.getKey().getNome() +" : "+entry.getValue().getNome());
        }

    }
}
