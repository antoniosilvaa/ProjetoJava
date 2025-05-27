package Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] integers = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
        System.out.println("----------");
        Integer[] integersArrays = new Integer[3];

        integersArrays[0] = 1;
        integersArrays[1] = 2;
        integersArrays[2] = 3;

        List<Integer> arrayToList = Arrays.asList(integersArrays);
        arrayToList.set(1, 12);
        System.out.println(Arrays.toString(integersArrays));
        System.out.println(arrayToList);
    }
}
