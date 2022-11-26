package javaExerсise.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1350; i < 1450; i++) {
            if ((i / 1000 + i / 100 % 10) == 5
                    && i % 100 / 10 + i % 100 % 10 == 5) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}