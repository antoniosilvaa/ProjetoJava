package Associação.Test;

import Associação.dominio.Escola;
import Associação.dominio.Professor;

public class escolaTest {
    public static void main(String[] args) {
       Professor professor = new Professor("Adalton");
        Professor professor1 = new Professor("Pryscila");
       Professor[] professores = {professor};
       Professor[] professors = {professor1};
       Escola escola = new Escola("unifametro", professores);
       Escola escola1 = new Escola("Unifametro", professors);


    escola.imprime();
        System.out.print("\n");
    escola1.imprime();


    }
}
