package Nio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/Antonio");
        Path arquivo = Paths.get("dev/arquivo.txt");
       Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

    }
}
