package Generics.service;

import Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {

    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));


    public Carro retriveAvailbaleCarro(){
        System.out.println("Buscando carro disponivel");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carros disponiveis para Alugueis");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void returnCar(Carro carro){
        System.out.println("Devolvendo carro alugado " +carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
