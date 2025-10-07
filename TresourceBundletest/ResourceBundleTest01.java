package academy.devjojo.maratonajava.javacore.TresourceBundletest;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // ResourceBundle é uma forma do java pegar uma mensagem baseada no local.
        // serve para internacionalizar, como opção de trocar o idioma do site.
        // puxa do arquivo fora do src.
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        boolean naruto = bundle.containsKey("naruto");
        System.out.println(naruto);

    }
}
