package Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // []
        // ? zero ou uma ocorrencias
        // * zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n,m} de n até m ocorrencias
        // ()
        // | o(v|c)o ovo |oco
        // . 1.3 = 123, 133, 1@3, 1A3
        // [dentro do cochetes ^ vira negativo] fora se utiliza para ver as primeiras palavras
        String regex = "([\\w0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z]+)+";
        String texto= "AntonioF@gmail.com, Beatriz123@hotmail.com, @#$Antonio@email.br, teste@gmail.com, teste2@mail";
        System.out.println("Email Valido");
        System.out.println("@#$Antonio@email.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
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
