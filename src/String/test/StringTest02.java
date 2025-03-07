package String.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         Antonio"; //String constant pool
        String numeros = "12356";
        System.out.println(nome.charAt(6));
        System.out.println(nome.length());
        System.out.println(nome.replace("A", "j"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.substring(0,5));
        System.out.println(nome.trim());
    }
}