package Nio.Test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta/SubSubPasta1");
        zip(arquivoZip,arquivosParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipStream = new  ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream <Path> stream = Files.newDirectoryStream(arquivosParaZipar)){
            for (Path file: stream){
                System.out.println(file.getFileName());
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso!!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
