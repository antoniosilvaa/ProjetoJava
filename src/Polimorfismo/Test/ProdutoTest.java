package Polimorfismo.Test;

import Polimorfismo.Servico.CalculadoraImposto;
import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Tomate;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzer", 7000);
        Tomate tomate = new Tomate("Cometa", 10);

        CalculadoraImposto.CalcularImpostoComputador(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImpostoTomate(tomate);
    }
}
