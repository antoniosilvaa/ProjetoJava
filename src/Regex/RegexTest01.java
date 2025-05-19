package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        Matcher matcher2 = pattern.matcher(texto2);

        System.out.println("Texto: " + texto);
        System.out.println("indice: 1234567");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find() && matcher2.find()){
            System.out.print(matcher.start()+ " ");
            System.out.print(matcher2.start()+ " ");
        }
    }
    
}
