package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // []
        // ? zero ou uma ocorrencias
        // * zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n,m} de n até m ocorrencias
        // ()
        // | o(v|c)o ovo |oco
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto= "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("indice: 1234567");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n");
        }
    }
}
