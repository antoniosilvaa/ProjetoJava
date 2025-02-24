package Polimorfismo.dominio;

public class Celular extends Produto{
    public static final double imposto = 0.07;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.Valor * imposto;
    }
}
