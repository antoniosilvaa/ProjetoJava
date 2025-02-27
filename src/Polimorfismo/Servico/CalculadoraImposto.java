package Polimorfismo.Servico;

import Polimorfismo.dominio.*;

public class CalculadoraImposto {


    public static void CalcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto: "+imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
        if (produto instanceof Geladeira) {
            Geladeira geladeira = (Geladeira) produto;
            System.out.println("Marca: " + geladeira.getMarca());
        }
    }
}
