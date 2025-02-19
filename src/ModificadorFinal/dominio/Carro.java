package ModificadorFinal.dominio;

public class Carro {
    private String Modelo;
    private int Ano;
    public static final double VELOCIDADE_LIMITE = 250;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
