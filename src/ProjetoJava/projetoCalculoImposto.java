package ProjetoJava;

public class projetoCalculoImposto {
    public static <string> void main(String[] args) {
        double salario = 1518;
        double imposto1 = 7.5 / 100;
        double imposto2 = 15 / 100;
        double imposto3 = 22.5 / 100;
        double valorDoImposto = 0;
        if (salario >= 2259) {
            valorDoImposto = salario * imposto1;
        } else if (salario >= 2826 && salario <= 3751) {
            valorDoImposto = salario * imposto2;
        } else if (salario < 2259) {
            System.out.println("voce esta insento de declara o imposto de renda");
        }else {
            valorDoImposto = salario * imposto3;
        }

        System.out.println(valorDoImposto);

    }
}
