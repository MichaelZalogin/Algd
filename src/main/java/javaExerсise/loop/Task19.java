package javaExerсise.loop;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 100; i < 153; i++) {
            if (i % 10 == 7) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}