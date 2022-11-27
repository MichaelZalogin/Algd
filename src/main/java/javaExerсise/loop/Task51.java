package javaExerсise.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int b = Math.max(n, m);
        for (int i = Math.min(n, m); i < b; i++) {
            if (i % 2 == 0) {
                stringJoiner.add(String.valueOf(0));
                continue;
            }
            stringJoiner.add(String.valueOf(i * i));
        }
        System.out.println(stringJoiner);
    }
}