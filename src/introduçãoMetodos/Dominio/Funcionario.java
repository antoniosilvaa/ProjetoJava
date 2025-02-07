package introduçãoMetodos.Dominio;

public class Funcionario {
    public String Nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial " + media);
    }
    }






