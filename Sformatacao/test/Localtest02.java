package academy.devjojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class Localtest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+ " ");
        }
        // getCurrencyInstance - formataçaõ de moedas.
    }
}
