package ModificadorEstatico.Test;

import ModificadorEstatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("GT 500", 350);
        Carro carro2 = new Carro("Ferrari", 400);
        Carro carro3 = new Carro("Uno com escada", 300);
        Carro.setVelociadeLimite(300);
        carro.imprime();
        carro.getVelocidadeMxima();
        System.out.println("\n----------");
        carro2.imprime();
        carro2.getVelocidadeMxima();
        System.out.println("\n--------------");
        carro3.imprime();
        carro3.getVelocidadeMxima();
    }
}
