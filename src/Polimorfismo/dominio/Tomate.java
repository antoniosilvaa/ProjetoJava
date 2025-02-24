package Polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double imposto = 0.03;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.print("imposto: ");
        return this.Valor * imposto;
    }
}
