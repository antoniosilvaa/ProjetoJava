package introduçãoMetodos.Dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21 - 12);
    }
    public void MutiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public int DivideDoisNumeros(int num1, int num2){
        if (num2 == 0){
            return 0;
        } else if (num1 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void alteraDoisNumeros(int numero1,int numero2){
        numero1 = 99;
        numero2 = 23;
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
