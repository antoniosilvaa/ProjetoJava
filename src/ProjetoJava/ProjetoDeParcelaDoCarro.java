package ProjetoJava;

public class ProjetoDeParcelaDoCarro {
    public static void main(String[] args) {
        float valorDaParcela;
        float valorDoCarro = 40000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++){
            valorDaParcela =   valorDoCarro / parcela;
            if(valorDaParcela >= 0){
               if (parcela >50){
                   break;
               }
                System.out.println("Parcela " + parcela + " R$" + valorDaParcela);
            }

        }
    }
}
