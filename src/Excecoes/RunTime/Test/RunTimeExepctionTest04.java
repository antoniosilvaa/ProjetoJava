package Excecoes.RunTime.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RunTimeExepctionTest04 {
    public static void main(String[] args) throws FileNotFoundException {
     try {
         throw new ArrayIndexOutOfBoundsException();
     }catch (IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e){
         //noinspection CallToPrintStackTrace
         e.printStackTrace();
     }catch (Exception e){
         System.out.println("Dentro do RunTimeExeption");
     }
    }
}
