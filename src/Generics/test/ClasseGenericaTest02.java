package Generics.test;

import Generics.dominio.Barco;
import Generics.dominio.Carro;
import Generics.service.BarcoRentalService;
import Generics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentalService barcoRentavelService = new BarcoRentalService();
        Barco barco = barcoRentavelService.retriveAvailbaleBarcos();
        System.out.println("Usando carro por um mês....");
        barcoRentavelService.returnBarco(barco);
    }
}
