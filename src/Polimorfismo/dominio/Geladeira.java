package Polimorfismo.dominio;

public class Geladeira extends Produto{
        public static final double imposto = 0.14;
        public String Marca;

    public Geladeira(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.Valor * imposto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
