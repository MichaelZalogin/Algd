package javaExerсise.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int unit;
        int decimal;
        int count = 0;
        int summ = 0;
        for (int i = 10; i < 99; i++) {
            unit = i / 10;
            decimal = i % 10;
            if (unit * decimal == 2 * (unit + decimal)) {
                stringJoiner.add(String.valueOf(i));
                count++;
                summ += i;
            }
        }
        System.out.println(String.format("Числа: %s, Количество: %d, Сумма: %d", stringJoiner, count, summ));
    }
}