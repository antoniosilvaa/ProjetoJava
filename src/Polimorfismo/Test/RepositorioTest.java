package Polimorfismo.Test;

import Polimorfismo.Repositorio.Repositorio;
import Polimorfismo.Servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List <String> list = new ArrayList<>();
        list.add("Antonio " + "85");
        list.add("Beatriz " + "85");
        System.out.println(list);
    }
}
