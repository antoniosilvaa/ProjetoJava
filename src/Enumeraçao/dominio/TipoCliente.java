package Enumeraçao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private String NomeRelatorio;
    public final int VALOR;

    TipoCliente(int valor, String NomeRelatorio) {
        this.VALOR = valor;
        this.NomeRelatorio = NomeRelatorio;
    }

    public String getNomeRelatorio() {
        return NomeRelatorio;
    }
}
