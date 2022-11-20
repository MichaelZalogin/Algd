package javaExerсise.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (i / 10 * i % 10 < num) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}