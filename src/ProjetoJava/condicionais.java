package ProjetoJava;

public class condicionais {
    public static <string> void main(String[] args) {
        double salario = 8000;
        string mensagemDoar = (string) "vou doar 1220 em prol da criança esperança";
        string mensagemNaoDoar = (string) "nao tenho condições, mas um dia irei ter";
        string resultado = salario > 4000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
