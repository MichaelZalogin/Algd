package javaExerсise.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1, b = 0; b < 5; i = i + n, b++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}