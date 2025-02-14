package Associação.Test;

import Associação.dominio.*;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Arthur", "Tecnologia da informação");
        Professor professor2 = new Professor("Bia", "Enfermagem");

        Local local = new Local("unifametro");
        Local local1 = new Local("UFC");

        Aluno aluno1 = new Aluno("aigor", 22);
        Aluno aluno2 = new Aluno("Antonio", 21);

        Titulo titulo = new Titulo("Programação");
        Titulo titulo2 = new Titulo("Enfermagem");

        Titulo[] titulos = {titulo};
        Titulo[] titulos02 = {titulo2};

        Aluno[] aluno01 = {aluno1};
        Aluno[] alunos02 = {aluno2};

        Local[] locals = {local};
        Local[] locals1 = {local1};

        Professor[] professores = {professor};
        Professor[] professor02 = {professor2};

        Seminario seminario = new Seminario(titulos, aluno01, locals, professores);

        Seminario seminario02 = new Seminario(titulos02, alunos02, locals1, professor02);

        seminario.imprime();
        System.out.println("--------------");
        seminario02.imprime();
    }
}
