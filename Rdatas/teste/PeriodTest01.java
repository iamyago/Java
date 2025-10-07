package academy.devjojo.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        // usado em dias, meses e anos.
        LocalDate now = LocalDate.now();
        LocalDate today = LocalDate.now().plusDays(2).plusDays(7);
        Period period = Period.between(now, today);
        System.out.println(period);
    }
}
