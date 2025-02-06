package introduçãoClasses.teste;

import introduçãoClasses.dominio.Estudante;
import introduçãoClasses.dominio.Professor;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Antonio";
        estudante.idade = 20;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
