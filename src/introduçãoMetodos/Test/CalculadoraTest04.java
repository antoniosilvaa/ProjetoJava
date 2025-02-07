package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[3];
        numeros[0] = 12;
        numeros[1] = 23;
        numeros[2] = 33;

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);

    }
}
