package javaExerсise.loop;

import java.util.StringJoiner;

public class Task33 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i < 160; i++) {
            if (i % 11 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}