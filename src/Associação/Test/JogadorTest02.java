package Associação.Test;

import Associação.dominio.Jogador;
import Associação.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romario");
        Time time1 = new Time("Flamengo");
/// aqui onde possui o setTime foi onde eu associei o jogador ao time mas isso so funciona quando é unidirecional
       jogador1.setTime(time1);
       jogador1.imprime();
    }
}
