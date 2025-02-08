package ModificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMxima;
    public static double velociadeLimite = 250;

    public void imprime(){
        System.out.println("\n----------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidade maxima: " + this.velocidadeMxima);
        System.out.println("Velocidade Limite: " + Carro.velociadeLimite);
    }

    public static void setVelociadeLimite(double velociadeLimite){
        Carro.velociadeLimite = velociadeLimite;
    }

    public static double getVelociadeLimite(){
        return velociadeLimite;
    }

    public Carro(String nome, double velocidadeMxima){
        this.nome = nome;
        this.velocidadeMxima = velocidadeMxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMxima() {
       if (velocidadeMxima > velociadeLimite){
           System.out.println("cuidado com a velocidade que esta acima da limite");
       }else{
           System.out.println("Seu carro está no limite de velocidade aceito, mas cuidado com a velocidade");
       }
        return velocidadeMxima;
    }

    public void setVelocidadeMxima(double velocidadeMxima) {
        this.velocidadeMxima = velocidadeMxima;
    }
}
