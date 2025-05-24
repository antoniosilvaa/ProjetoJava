package Nio.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreatedFile = file.createNewFile();

      boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        System.out.println(isCreatedFile);
        System.out.println(isModified);

    }
}
