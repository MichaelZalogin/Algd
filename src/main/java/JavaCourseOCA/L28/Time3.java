package JavaCourseOCA.L28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.JUNE, 03);
        LocalTime ld2 = LocalTime.of(3, 3, 16, 3);
        LocalDateTime ld3 = LocalDateTime.of(ld1, ld2);
        // Информация с LocalDate
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());
        // Информация с LocalTime
        System.out.println(ld2.getHour());
        System.out.println(ld2.getMinute());
        System.out.println(ld2.getNano());
        System.out.println(ld2.getSecond());

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter d3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("ww, dd, MM, YYYY, hh:mm:ss:nn");
        DateTimeFormatter d5 = DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(ld1.format(d1));
        System.out.println(ld2.format(d2));
        System.out.println(ld1.format(d3));
        System.out.println(ld3.format(d4));
        System.out.println(ld3.format(d5));
        String s1 = "06 03 2016";
        LocalDate ld5 = LocalDate.parse(s1, d5);
        System.out.println(ld5);
    }
}