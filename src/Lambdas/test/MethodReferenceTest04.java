package Lambdas.test;

import Lambdas.Service.AnimeComparator;
import Lambdas.domain.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparator> newAnimeComparators =AnimeComparator::new;
        AnimeComparator animeComparators = newAnimeComparators.get();
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList =new ArrayList<>(List.of(new Anime("Naruto", 670), new Anime("pokemom", 671)));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
    }
}
