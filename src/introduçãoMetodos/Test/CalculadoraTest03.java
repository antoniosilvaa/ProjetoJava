package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.DivideDoisNumeros(20,2);
        System.out.println(result);
    }
}
