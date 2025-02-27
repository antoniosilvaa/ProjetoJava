package Excecoes.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExpectionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        try{
           boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado" + isCriado);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
