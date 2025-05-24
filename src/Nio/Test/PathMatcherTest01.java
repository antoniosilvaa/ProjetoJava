package Nio.Test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path =  Paths.get("pasta/subpasta/file.bkp");
        Path path2 =  Paths.get("pasta/subpasta/file.txt");
        Path path3 =  Paths.get("pasta/subpasta/file.java");

        matches(path, "glob:**.bkp");
        matches(path2, "glob:**/*.txt");
        matches(path3, "glob:**.{java,bkp,txt}");
        matches(path3, "glob:**.????");

    }
    private static void matches (Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ":  " + matcher.matches(path));
    }
}
