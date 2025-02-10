package ModificadorEstatico.dominio;

public class Anime {
    private String  nome;
    private static int[] episodios;
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public  Anime() {

        for (int episodios : Anime.episodios){
            System.out.print(episodios + " ");
        }

    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
