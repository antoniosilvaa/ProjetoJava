package Excecoes.RunTime.Test;

public class RunTimeExepctionTest02 {
    public static void main(String[] args) {
        try {
            divisao(2,0);
        } catch (RuntimeException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    private static int divisao(int a, int b)throws IllegalArgumentException {
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, B nao pode ser 0");
        }
        return a/b;
    }

}
