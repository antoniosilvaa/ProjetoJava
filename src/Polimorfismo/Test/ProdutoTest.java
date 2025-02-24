package Polimorfismo.Test;

import Polimorfismo.Servico.CalculadoraImposto;
import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Televisao;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzer", 7000);
        Televisao televisao = new Televisao("LG smart", 5340);

        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.CalcularImposto(televisao);
    }
}
