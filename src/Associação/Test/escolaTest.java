package Associação.Test;

import Associação.dominio.Escola;
import Associação.dominio.Professor;

public class escolaTest {
    public static void main(String[] args) {
       Professor professor = new Professor("Adalton");
       Professor[] professores = {professor};
       Escola escola = new Escola("unifametro", professores);

    escola.imprime();


    }
}
