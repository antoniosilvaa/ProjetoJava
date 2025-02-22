package Interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }
}
