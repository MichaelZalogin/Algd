package javaExerсise.loop;

import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 1550; i > 1050; i--) {
            if (i % 100 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}