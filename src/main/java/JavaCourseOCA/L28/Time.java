package JavaCourseOCA.L28;

import java.time.*;

public class Time {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2014, Month.MAY, 13);
        LocalDate ld2 = LocalDate.of(2014, 4, 13);
        LocalDate lf1 = ld1.plusDays(3);
        ld1.isAfter(ld2);
        ld1.isBefore(ld2);

        lf1 = lf1.minusDays(3);
        lf1 = lf1.plusMonths(3);
        lf1 = lf1.minusYears(3);
        lf1 = lf1.minusWeeks(3);

        System.out.println(lf1);
        System.out.println(ld1);
        System.out.println(ld2);

        LocalTime l1 = LocalTime.of(3, 5, 6);
        System.out.println(l1);
    }
}