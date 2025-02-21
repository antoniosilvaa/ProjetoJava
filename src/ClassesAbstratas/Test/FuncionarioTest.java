package ClassesAbstratas.Test;

import ClassesAbstratas.dominio.Desenvolvedor;
import ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Antonio", 6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Antonio", 20000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
