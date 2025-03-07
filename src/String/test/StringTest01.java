package String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Antonio"; //String constant pool
        String nome2 = "Antonio"; //String constant pool
    nome = nome.concat(" bia");
        System.out.println(nome);
        System.out.println(nome.equals(nome2));
        String nome3 = "Antonio";
        System.out.println(nome2.equals(nome3.intern()));
    }
}
