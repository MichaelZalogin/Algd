package javaExerсise.loop;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 10; i < 19; i += 2) {
            if (i % 4 == 0) {
                stringJoiner.add(i + "#");
                continue;
            }
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}