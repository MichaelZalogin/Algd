package javaExerсise.loop;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 1; i < 10; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}