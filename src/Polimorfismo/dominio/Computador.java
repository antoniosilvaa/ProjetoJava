package Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double imposto = 0.07;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.print("Imposto: ");
        return this.Valor * imposto;
    }
}
