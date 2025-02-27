package Polimorfismo.Servico;

import Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Arquivo");
    }
}
