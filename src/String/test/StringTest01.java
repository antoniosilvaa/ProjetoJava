package String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Antonio"; //Strring constant pool
        String nome2 = "Antonio"; //Strring constant pool
    nome = nome.concat(" bia");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Antonio");
        System.out.println(nome2.equals(nome3.intern()));
    }
}
