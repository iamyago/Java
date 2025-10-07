package academy.devjojo.maratonajava.javacore.Rdatas.teste;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurantionTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime AftertYears = LocalDateTime.now().plusYears(2);
        LocalTime TimeNow = LocalTime.now();
        LocalTime Minus7hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(localDateTime, AftertYears);
        System.out.println(d1);

        // nao pode usar LocalDate pq n possui o Seconds.
        // duration trabalha com periodo de tempo.

    }
}
