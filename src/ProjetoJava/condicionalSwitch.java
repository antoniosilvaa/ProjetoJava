package ProjetoJava;

public class condicionalSwitch {
    public static <string> void main(String[] args) {
        char sexo = 'B';

        switch (sexo){
            case 'B':
                System.out.println("Boy");
                break;
            case 'G':
                System.out.println("Girl");
                break;
            default:
                System.out.println("Incorrect");
                break;
        }

    }
}
