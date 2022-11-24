package javaExerсise.loop;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 30; i++) {
            if ((i / 10) * (i % 10) >= 10 &&
                    (i / 10) * (i % 10) <= 99) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}