package Lambdas.test;

import Lambdas.Service.AnimeComparator;
import Lambdas.domain.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 1002), new Anime("Dragon Ball Z", 850)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        animeList.sort(AnimeComparator::compareByTitle);

        System.out.println(animeList);

        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
    }
}
