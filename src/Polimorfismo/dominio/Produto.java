package Polimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String Nome;
    protected double Valor;

    public Produto(String nome, double valor) {
        Nome = nome;
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Produto " +
                "Nome: '" + Nome +
                ", Valor: " + Valor;
    }
}
