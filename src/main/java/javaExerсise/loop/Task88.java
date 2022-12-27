package javaExerсise.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i == 3 * (i / 10) * (i % 10)) {
                stringJoiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.println(String.format("Числа: %s, Количество: %d", stringJoiner, count));
    }
}