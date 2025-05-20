package Regex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi Bia Antonio, true , 200";
       String[] nomes = texto.split(" ");

       for (String nome : nomes){
           System.out.println(nome.trim());
       }
    }
}
