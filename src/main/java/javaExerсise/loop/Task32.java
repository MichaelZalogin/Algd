package javaExerсise.loop;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 50; i >= 10; i--) {
            if (i % 10 == 7) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}