package Interfaces.Test;

import Interfaces.dominio.DatabaseLoader;
import Interfaces.dominio.FileLoader;

public class DataloaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();

    }
}
