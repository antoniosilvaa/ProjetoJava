package String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "antonio";
        nome.concat("bia");
        System.out.println(nome);
        StringBuilder  sb = new StringBuilder("antonio ");
        sb.append( 13);
        System.out.println(sb);
    }
}
