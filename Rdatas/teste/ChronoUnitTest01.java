package academy.devjojo.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario =  LocalDateTime.of(2006, Month.MAY, 10,12,0);
        LocalDateTime now =  LocalDateTime.now();
        ChronoUnit.DAYS.between(aniversario, now);
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
    }
}
