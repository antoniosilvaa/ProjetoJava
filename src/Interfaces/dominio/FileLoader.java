package Interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um aruivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um aqruivo");
    }
}
