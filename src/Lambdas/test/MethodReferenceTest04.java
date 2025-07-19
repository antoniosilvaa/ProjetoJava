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
        List<Anime> animeList2 =new ArrayList<>(List.of(new Anime("Naruto", 674), new Anime("pokemom", 675)));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        animeList2.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
        System.out.println(animeList2);
    }
}
