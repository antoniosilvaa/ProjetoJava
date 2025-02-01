package ProjetoJava;

public class condicionalSwitch {
    public static void main(String[] args) {
        char sexo = 'J';

        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
