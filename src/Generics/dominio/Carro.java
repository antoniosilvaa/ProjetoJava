package Generics.dominio;

public class Carro {
    private String Nome;

    public Carro(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}
