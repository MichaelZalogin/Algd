package javaExerсise.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if ((a * a) + (c * c) == (b * b)) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}