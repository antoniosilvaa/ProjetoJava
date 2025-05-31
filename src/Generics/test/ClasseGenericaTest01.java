package Generics.test;

import Generics.dominio.Carro;
import Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retriveAvailbaleCarro();
        System.out.println("Usando carro por um mês....");
        carroRentavelService.returnCar(carro);
    }
}
