package Excecoes.RunTime.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RunTimeExepctionTest04 {
    public static void main(String[] args) throws FileNotFoundException {
     try {
         throw new ArithmeticException();
     }catch (ArrayIndexOutOfBoundsException e){
         e.printStackTrace(new PrintStream("falha no array"));
     }catch (IllegalArgumentException e){
         //noinspection CallToPrintStackTrace
         e.printStackTrace();
     }catch (ArithmeticException e){
         //noinspection CallToPrintStackTrace
         e.printStackTrace();
     }
    }
}
