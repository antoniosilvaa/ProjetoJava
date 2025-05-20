package Io.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw, 2048)) {
            br.write("Email: antoniogondim109@gmail.com");
            br.newLine();
            br.write("Email: Biam0ura@gmail.com");
            br.newLine();
            br.write("CPF: "+ 1234567891);
            br.flush();
            System.out.println("Email enviado");
            System.out.println("CPF enviado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
