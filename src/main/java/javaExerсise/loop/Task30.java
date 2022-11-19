package javaExerсise.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {
            if (num % 10 == i % 10) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}