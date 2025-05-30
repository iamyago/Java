package academy.devjojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // padrao e publico e abstract.
    // se o metodo for default tem q deixar explicito.
    //
    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("aaaaaaaaa");
    }
}
