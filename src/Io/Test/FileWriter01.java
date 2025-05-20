package Io.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Email: antoniogondim109@gmail.com\n Email: Biam0ura@gmail.com\n");
            fw.write("CPF: "+ 1234567891+ "\n");
            fw.flush();
            System.out.println("Email enviado");
            System.out.println("CPF enviado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
