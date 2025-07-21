package Streams.Test;

import Streams.Class.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
        private static List<LightNovel> list = new ArrayList<>(List.of(new LightNovel("Piece", 5),
                new LightNovel("dragon ball", 7), new LightNovel("Pokemom", 3)));
    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitel));
        List<String> title = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4  ){
                title.add(lightNovel.getTitel());
            }
            if (title.size() >= 3){
                break;
            }
        }
        System.out.println(title);
        System.out.println(list);
    }
}
