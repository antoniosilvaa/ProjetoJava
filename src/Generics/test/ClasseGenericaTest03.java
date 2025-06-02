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

    }
}