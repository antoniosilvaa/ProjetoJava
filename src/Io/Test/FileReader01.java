package Io.Test;

import java.io.File;
import java.io.FileReader;

public class FileReader01 {
    public static void main(String[] args) {
        char[] in = new char [1];
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
          StringBuilder texto = new StringBuilder();
          while (fr.read(in) != -1){
              texto.append(in);
          }
            System.out.println(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
