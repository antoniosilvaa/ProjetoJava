package Associação.Test;

import Associação.dominio.Jogador;
import Associação.dominio.Time;

import java.util.Scanner;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("romario");
        Jogador jogador2 = new Jogador("Vina");
        Jogador jogador3 = new Jogador("Pele");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};


        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
