package javaExerсise.loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            if (i / 100 % 2 == 0 && i % 100 / 10 % 2 == 0 && i % 100 % 10 % 2 == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}