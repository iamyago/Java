package academy.devjojo.maratonajava.javacore.Minterfaces.teste;

import academy.devjojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devjojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
