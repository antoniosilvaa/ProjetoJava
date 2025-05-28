package Colecoes.test;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private String nome;
    private Long id;

    public Consumidor(String nome, Long id) {
        this.nome = nome;
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
