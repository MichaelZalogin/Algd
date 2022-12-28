package javaExerсise.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        double sqrHundreds = 0, sqrDecimal = 0, sqrUnits = 0;
        int count = 0;
        for (int i = 100; i < 999; i++) {
            sqrHundreds = Math.pow(i / 100, 3);
            sqrDecimal = Math.pow(i / 10 % 10, 3);
            sqrUnits = Math.pow(i % 100 % 10, 3);
            if (sqrHundreds + sqrDecimal + sqrUnits == i) {
                stringJoiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.println(String.format("Числа: %s, Количество: %d", stringJoiner, count));
    }
}