package Io.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean deleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println("Created: "+isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("is list " + file.list());
            System.out.println("last modified" + new Date(file.lastModified()));
            if (file.exists()){
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
