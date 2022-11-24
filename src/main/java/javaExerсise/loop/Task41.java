package javaExerсise.loop;

import java.util.StringJoiner;

public class Task41 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 20; i <= 35; i++) {
            if (i % 10 % 3 == i / 10 % 3) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}