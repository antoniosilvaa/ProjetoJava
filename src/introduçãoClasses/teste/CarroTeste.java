package introduçãoClasses.teste;

import introduçãoClasses.dominio.ProjetoCarro;

public class CarroTeste {
    public static void main(String[] args) {
        ProjetoCarro projetoCarro = new ProjetoCarro();
        ProjetoCarro projetoCarro2 = new ProjetoCarro();
        projetoCarro.nome = "Volkswagen";
        projetoCarro.modelo = "Gol";
        projetoCarro.ano = 2016;
        projetoCarro.cor = "Prata";



        System.out.println("Marca: " + projetoCarro.nome);
        System.out.println("Modelo " + projetoCarro.modelo);
        System.out.println("Ano: " + projetoCarro.ano);
        System.out.println("Cor: " + projetoCarro.cor);

        System.out.println("\n---------------");


        projetoCarro2.nome = "Fiat";
        projetoCarro2.modelo = "Uno";
        projetoCarro2.ano = 2024;
        projetoCarro2.cor = "Azul";


        System.out.println("Marca: " + projetoCarro2.nome);
        System.out.println("Modelo " + projetoCarro2.modelo);
        System.out.println("Ano: " + projetoCarro2.ano);
        System.out.println("Cor: " + projetoCarro2.cor);

    }
}
