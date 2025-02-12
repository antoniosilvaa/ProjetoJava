package Associação.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;
    public Time(String nome) {
        this.nome = nome;
    }

    public Time(Jogador[] jogadores, String nome) {
        this.jogadores = jogadores;
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (jogadores == null)return;
        for (Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogador() {
        return jogadores;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogadores = jogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
