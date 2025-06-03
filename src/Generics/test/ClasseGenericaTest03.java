package Generics.test;
import Generics.dominio.Barco;
import Generics.dominio.Carro;
import Generics.service.RentalService;
import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetosDisponiveis();
        System.out.println("Usanado carro por um mes...");
        rentalService.returnObjects(carro);
        System.out.println("----------------");
        RentalService<Barco> rentalService1 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService1.buscarObjetosDisponiveis();
        System.out.println("Usando Barco por um mês");
        rentalService1.returnObjects(barco);

    }
}