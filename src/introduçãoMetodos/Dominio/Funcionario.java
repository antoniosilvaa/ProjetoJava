package introduçãoMetodos.Dominio;

public class Funcionario {
    private String Nome;
    private int idade;
    private double[] salarios;
    private double media = 0;
    public void impressora() {
        System.out.println(this.Nome);
        System.out.println(this.idade);
      if (salarios == null){
          return;
      }
        for (double salario : salarios){
          System.out.println(salario + " ");
      }
        mediaSalarios();
    }

    public void mediaSalarios(){
        if (salarios == null){
            return;
        }
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}






