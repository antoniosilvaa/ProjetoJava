package Io.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)){
            String linha;

            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
