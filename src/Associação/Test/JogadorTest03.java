package Associação.Test;

import Associação.dominio.Jogador;
import Associação.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Marcos Vcitor");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Céara");
        Time time2 = new Time("Santos");

        jogador2.setTime(time2);
        jogador.setTime(time);
        System.out.println("time 1");
        jogador.imprime();
        System.out.println("");
        System.out.println("time 2");
        jogador2.imprime();

    }
}
