package Excecoes.RunTime.Test;

public class RunTimeExepctionTest04 {
    public static void main(String[] args) {
     try {
         throw new IllegalArgumentException();
     }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("dentro do array");
     }catch (IllegalArgumentException e){
         System.out.println("dentro do IllegalArgumentException ");
     }catch (ArithmeticException e){
         System.out.println("dentro do ArithmeticException ");
     }
    }
}
