package Polimorfismo.Test;

import Polimorfismo.Servico.CalculadoraImposto;
import Polimorfismo.dominio.*;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzer", 7000);
        Televisao televisao = new Televisao("LG smart", 5340);
        Celular Iphone = new Celular("Iphone 15", 6000 );
        Tomate tomate = new Tomate("Americana", 20);
        tomate.setDataValidade("10/05/2025");

        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(televisao);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(Iphone);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(tomate);
    }
}
