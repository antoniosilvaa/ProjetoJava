package Colecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private int quantidade;

    public Manga(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Manga(int quantidade, String nome, Long id) {
        this(id,nome);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Manga outroManga) {
   //  if (this.id < outroManga.getId()){
   //           return -1;
   //       }else if (this.id.equals(outroManga.getId())){
   //           return 0;
   //       }else{
   //           return 1;
   //       }

        return this.id.compareTo(outroManga.getId());

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
