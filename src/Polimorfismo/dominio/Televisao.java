package Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double imposto = 0.03;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.Valor * imposto;
    }
}
