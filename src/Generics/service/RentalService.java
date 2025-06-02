package Generics.service;

import Generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService <T>{

    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }


    public T buscarObjetosDisponiveis(){
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Objeto carro: "+t);
        System.out.println("Objetos disponiveis para Alugueis");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void returnObjects(T t){
        System.out.println("Devolvendo objeto alugado " +t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
