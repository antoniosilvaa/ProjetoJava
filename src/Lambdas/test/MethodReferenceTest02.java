package Lambdas.test;

import Lambdas.Service.AnimeComparator;
import Lambdas.domain.Anime;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList =new ArrayList<>(List.of(new Anime("Naruto", 670), new Anime("pokemom", 671)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);

        System.out.println(animeList);
    }
}
