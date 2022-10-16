package javaCourseOCA.L28;

import java.time.*;

public class Time2 {
    static void Smena(LocalDate l1, LocalDate l2, Period p) {
        LocalDate start = l1;
        LocalDate finish = l2;
        while (start.isBefore(finish)) {
            System.out.println("Наступила дата: " + start + ". Пора менять дежурного");
            start = start.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.JUNE, 06);
        LocalDate konec = LocalDate.of(2017, Month.JUNE, 06);
        Period p1 = Period.of(0, 1, 0);
        Period p2 = Period.ofMonths(3);
        Smena(nachalo, konec, p1);
        Duration d1 = Duration.ofHours(3);
    }
}