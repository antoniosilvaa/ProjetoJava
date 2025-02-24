package Polimorfismo.Test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Tomate;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador", 6000);
        Tomate tomate = new Tomate("Tomate", 3);
        System.out.println(computador);
        System.out.println(computador.calcularImposto());
        System.out.println(tomate);
        System.out.println(tomate.calcularImposto());

    }
}
