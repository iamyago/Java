package academy.devjojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFomartTest01 {
    public static void main(String[] args) {
        Locale localDefault = Locale.getDefault();
        Locale locaPT = new Locale(" pt", "BR");
        Locale locaJP = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[3];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locaPT);
        nfa[2] = NumberFormat.getInstance(locaJP);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println (numberFormat.format(valor));
        }
    }
}
