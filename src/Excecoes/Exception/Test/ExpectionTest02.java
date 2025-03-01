package Excecoes.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExpectionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    public static void  criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try{
           boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado " + isCriado);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}