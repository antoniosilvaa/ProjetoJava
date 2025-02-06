package introduçãoClasses.teste;

import introduçãoClasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nomeProfessor = "adailton";
        professor.idadeProfessor = 65;
        professor.sexoProfessor = 'M';

        System.out.println("Nome: " + professor.nomeProfessor);
        System.out.println("Idade: " + professor.idadeProfessor + " Anos");
        System.out.println("Sexo: " + professor.sexoProfessor);
    }
}
