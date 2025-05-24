package Nio.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified: " + lastModifiedTime);
        System.out.println("Last acess: " + lastAccessTime);

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifiedTime, fileTime, creationTime);

        creationTime = basicFileAttributeView.readAttributes().creationTime();
        lastModifiedTime = basicFileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last modified: " + lastModifiedTime);
        System.out.println("Last acess: " + lastAccessTime);


    }
}
