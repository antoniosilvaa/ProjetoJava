package ProjetoJava;

public class ProjetoDeParcelaDoCarro {
    public static void main(String[] args) {
        int valorDaParcela;
        int valorDoCarro = 12000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++){
            valorDaParcela =   valorDoCarro / parcela;
            if(valorDaParcela >= 700){
               if (parcela > 12){
                   break;
               }
                System.out.println("Parcela " + parcela + " R$" + valorDaParcela);
            }

        }
    }


}
