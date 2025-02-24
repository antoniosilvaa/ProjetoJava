package Polimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String Nome;
    protected double Valor;

    public Produto(String nome, double valor) {
        Nome = nome;
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public double getValor() {
        return Valor;
    }
}
