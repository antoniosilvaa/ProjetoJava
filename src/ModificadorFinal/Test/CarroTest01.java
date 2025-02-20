package ModificadorFinal.Test;

import ModificadorFinal.dominio.Carro;
import ModificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.comprador.setNome("luffy");
        System.out.println(carro.comprador);
        Ferrari ferrari =new Ferrari();
        ferrari.setModelo("gt500");
        System.out.println("-----------");
        ferrari.imprime();
    }
}
