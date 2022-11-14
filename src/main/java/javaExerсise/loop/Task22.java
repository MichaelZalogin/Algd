package javaExerсise.loop;

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < 300; i++) {
            if (i / 100 > 0 && i % 80 == 45) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}