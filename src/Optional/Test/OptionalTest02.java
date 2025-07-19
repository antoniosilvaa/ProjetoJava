package Optional.Test;

import Optional.Domain.Manga;
import Optional.Repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
      Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Pokemom");
                mangaByTitle.ifPresent(m-> m.setTitle("Pokemom 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Lego")
                .orElse(new Manga(3, "lego", 234));

        System.out.println(newManga);
    }
}
