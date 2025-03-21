package Polimorfismo.Test;

import Polimorfismo.Servico.CalculadoraImposto;
import Polimorfismo.dominio.*;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 9T", 7000);
        Televisao televisao = new Televisao("LG smart", 5340);
        Celular Iphone = new Celular("Iphone 15", 6000 );
        Tomate tomate = new Tomate("Americana", 20);
        tomate.setDataValidade("10/05/2025");
        Geladeira geladeira = new Geladeira("Eletrolucx", 8000);
        geladeira.setMarca("LG");

        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(televisao);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(Iphone);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(geladeira);
    }
}
