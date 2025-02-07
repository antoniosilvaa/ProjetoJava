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
}
