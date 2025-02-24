package Polimorfismo.Servico;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {


    public static void CalcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do Televisão");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto: "+imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
