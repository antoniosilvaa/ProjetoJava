package Excecoes.RunTime.Test;

public class RunTimeExpection03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {

        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
