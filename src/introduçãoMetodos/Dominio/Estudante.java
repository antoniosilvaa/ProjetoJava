package introduçãoMetodos.Dominio;

public class Estudante {
    public String Nome;
    public int Idade;
    public char Sexo;

    public void imprime(){
        System.out.println(this.Nome);
        System.out.println(this.Idade);
        System.out.println(this.Sexo);
    }

}