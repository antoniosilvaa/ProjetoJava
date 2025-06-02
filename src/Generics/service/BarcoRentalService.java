package Generics.service;

import Generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {


        private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));


        public Barco retriveAvailbaleBarcos(){
        System.out.println("Buscando barco disponivel");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Carros disponiveis para Alugueis");
        System.out.println(barcosDisponiveis);
        return barco;
    }

        public void returnBarco(Barco barco) {
            System.out.println("Devolvendo barco alugado " + barco);
            barcosDisponiveis.add(barco);
            System.out.println("Carros disponiveis para alugar: ");
            System.out.println(barcosDisponiveis);
        }
}
