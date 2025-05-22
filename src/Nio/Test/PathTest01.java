package Nio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\aride\\IdeaProjects\\ProjetoJava\\pasta\\arquivo.txt");
        System.out.println(path.getFileName());
    }
}
