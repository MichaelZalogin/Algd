package javaExerсise.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {
            if (i / 100 * i % 100 % 10 == Math.pow((i % 100 / 10), 2)) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}