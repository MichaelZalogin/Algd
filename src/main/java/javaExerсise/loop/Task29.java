package javaExerсise.loop;

import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i < 150; i++) {
            if (i / 100 + i / 10 % 10 + i % 10 == num) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}