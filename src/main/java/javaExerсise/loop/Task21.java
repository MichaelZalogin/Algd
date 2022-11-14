package javaExerсise.loop;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 38; i > 9; i--) {
            if (i % 5 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}