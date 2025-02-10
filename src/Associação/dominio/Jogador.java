package Associação.dominio;

public class Jogador {
    private String nome;
    private Time time;


    public void imprime(){
        System.out.print(this.nome + " ");
        if (time != null){
            System.out.print(time.getNome());
        }
    }

    public Jogador(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
