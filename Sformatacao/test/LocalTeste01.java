package academy.devjojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTeste01 {
    public static void main(String[] args) {
        // define a lingua  ISO - pt-BR
        Locale locale = new Locale("it", "IT");
        Locale locale2 = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        System.out.println("Italia"+df1.format(calendar.getTime()));
        System.out.println("Brasil"+df2.format(calendar.getTime()));

        // //nesse caso, ele só coloca a lingua como japonesa, mas nao define o local da variavel.
        //Locale localeJp = Locale.JAPANESE
        //
        ///aqui vc define o local que é a jpão e tambem a linguagem vem japonesa, portanto acho melhar definir o local logo de uma vez
        //que ja vem ingua e local.
        //Locale localeJapan = Locale.JAPAN;
        //
        //
        //Mas vc tambem pode usar essas variáveis estaticas diretamente como argumento no metodo getDisplayCountry().
        //No exemplo que ele deu, da pra fazer assim: localeItaly.getDisplayContry(Locale.JAPAN). //ou Locale.JAPANESE
        //
        //Acho bem mais pratico usar essas variáveis estáticas quando possivel. (não tem de todos os países).

    }
}
