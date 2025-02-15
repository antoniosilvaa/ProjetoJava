package Associação.dominio;

public class Seminario {
        private Professor[] professor;
        private Aluno[] aluno;
        private Local[] local;
        private Titulo[] titulo;

    public Seminario( Aluno[] aluno, Local[] local, Professor[] professor) {
        this.professor = professor;
        this.aluno = aluno;
        this.local = local;
    }

    public Seminario(Titulo[] titulo ,Aluno[] aluno, Local[] local,Professor[] professor) {
        this.professor = professor;
        this.aluno = aluno;
        this.local = local;
        this.titulo = titulo;
    }

    public void imprime(){
        if (titulo == null){
            return;
        }
        for (Titulo titulo : titulo){
            System.out.println("Palestra: " + titulo.getTitulo());
        }

        if (aluno == null){
            return;
        }
        for (Aluno aluno : aluno){
            System.out.print("Aluno: " + aluno.getNome() + " ");
            System.out.println("Idade: " + aluno.getIdade());
        }
        if (local == null){
            return;
        }
        for (Local local : local){
            System.out.println("Local: " + local.getLocal());
        }
      if (professor == null){
          return;
      }

      for (Professor professor : professor){
          System.out.println("Professor(a): " + professor.getNome());
          System.out.println("Especialidade: " + professor.getEspecialidade());
      }

    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local[] getLocal() {
        return local;
    }

    public void setLocal(Local[] local) {
        this.local = local;
    }

    public Titulo[] getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo[] titulo) {
        this.titulo = titulo;
    }
}
