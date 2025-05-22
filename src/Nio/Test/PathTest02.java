package Nio.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("pasta2");
        if (Files.notExists(pasta)) {
            Path pastaDirectory = Files.createDirectory(pasta);
            System.out.println("Created Directory: " + pastaDirectory);
        } else {
            System.out.println("Pasta ja existe");
        }

        Path subPastaPath = Paths.get("pasta/subpasta");
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(subPastaPath)) {
            Path pastaDirectories = Files.createDirectories(subPastaPath);
            System.out.println("Created Directories: " + pastaDirectories);
        } else if (Files.notExists(filePath)) {
          Path filePathIsCreated = Files.createFile(filePath);
            System.out.println("Created File: " + filePathIsCreated);
        } else {
            System.out.println("Subpastas ja criadas");
            System.out.println("File ja criada");
        }

        Path subPastaPath2 = Paths.get("pasta2/subpasta");
        Path filePath2 = Paths.get(subPastaPath2.toString(), "file.txt2");
        if (Files.notExists(subPastaPath2)) {
            Path pastaDirectories2 = Files.createDirectories(subPastaPath2);
            System.out.println("Created Directories: " + pastaDirectories2);
        } else if (Files.notExists(filePath2)) {
            Path filePathIsCreated2 = Files.createFile(filePath2);
            System.out.println("Created File: " + filePathIsCreated2);
        } else {
            System.out.println("Subpastas ja criadas, agora na pasta2");
            System.out.println("File2 ja criada");
        }
    }
}
