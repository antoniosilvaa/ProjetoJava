package Associação.Test;

import java.util.Scanner;

public class LeituraDeTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O Grande software de previsão do futuro");
        System.out.println("Digite sua pergunta abaixo");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else {
            System.out.println("Nâo");
        }

    }
}
