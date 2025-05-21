package Io.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
       Boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File("C:\\Users\\aride\\IdeaProjects\\ProjetoJava\\pasta\\arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        try (FileWriter fw = new FileWriter(fileArquivoDiretorio, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Email: antoniogondim109@gmail.com");
            bw.newLine();
            bw.write("Email: Biam0ura@gmail.com");
            bw.newLine();
            bw.write("CPF: "+ 1234567891);
            bw.flush();
            System.out.println("Email enviado");
            System.out.println("CPF enviado");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
