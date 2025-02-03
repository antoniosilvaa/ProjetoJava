package ProjetoJava;

public class Operadores {
    public static <string> void main(String[] args) {
        int idade = 19;
        string categoria;

        if (idade < 15){
            categoria = (string) "categoria infantil";
        }else if (idade >= 15 && idade <=18 ){
            categoria = (string)"categoria juvenil";
        }else {
            categoria = (string) "categoria adulta";
        }
        System.out.println(categoria);


    }
}
