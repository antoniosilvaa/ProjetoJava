package Nio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/Antonio");
        Path clazz = Paths.get("/home/Antonio/dev/olamundo.java");
        Path PathToClazz = dir.relativize(clazz);
        System.out.println(PathToClazz);
    }
}
