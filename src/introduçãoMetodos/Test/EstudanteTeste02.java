package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Estudante;
import introduçãoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.Nome = "Aigor";
        estudante1.Sexo = 'M';
        estudante1.Idade = 20;

        estudante2.Nome = "Carla";
        estudante2.Idade = 20;
        estudante2.Sexo = 'F';

        estudante1.imprime();
        System.out.println("\n------------");
        estudante2.imprime();
    }
}
