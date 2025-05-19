package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // []
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto: " + texto2);
        System.out.println("indice: 1234567");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n ");
        }
    }
}
