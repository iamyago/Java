package academy.devjojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void checkPermission() {
        System.out.println("Checando.....");
    }

    @Override
    public void remove() {
        System.out.println("Deletando");
    }

    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }
}
