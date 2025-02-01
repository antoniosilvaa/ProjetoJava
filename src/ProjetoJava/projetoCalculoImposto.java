package ProjetoJava;

public class projetoCalculoImposto {
    public static <string> void main(String[] args) {
        double salario = 90000;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 45.05 / 100;
        double valorDoImposto;
        if (salario <= 34714) {
            valorDoImposto = salario * imposto1;
        } else if (salario >= 34714 && salario <= 66507) {
            valorDoImposto = salario * imposto2;
        } else {
            valorDoImposto = salario * imposto3;
        }

        System.out.println(valorDoImposto);

    }
}
