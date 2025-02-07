package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Estudante;
import introduçãoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.Nome = "Aigor";
        estudante1.Sexo = 'M';
        estudante1.Idade = 20;

        estudante2.Nome = "Carla";
        estudante2.Idade = 20;
        estudante2.Sexo = 'F';

        impressoraEstudante.imprime(estudante1);
        System.out.println("\n-------------------");
        impressoraEstudante.imprime(estudante2);

    }
}
