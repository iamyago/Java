package academy.devjojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carrega os arquivos");
    }

    @Override
    public void checkPermission() {
        System.out.println("checandoooooo no aruqivo");
    }

    @Override
    public void remove() {
        System.out.println("removerrrr");
    }
}
