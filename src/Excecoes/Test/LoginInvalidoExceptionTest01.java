package Excecoes.Test;

import Excecoes.Exception.Test.LonginInvalidoExceptions;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LonginInvalidoExceptions e) {
            throw new RuntimeException(e);
        }
    }
    private static void Logar() throws LonginInvalidoExceptions {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Antonio";
        String senhaDB = "antonio0109";
        System.out.println("Usuario: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada) ){
           throw new LonginInvalidoExceptions("Usuario ou senha ivalidos");
        }else {
            System.out.println("Usuario logado com sucesso!!");
        }

    }
}
