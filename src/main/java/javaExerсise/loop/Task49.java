package javaExerсise.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner stringJoiner = new StringJoiner("+");
        int b = Math.min(n, m);
        int i = b % 2 == 0 ? b : b + 1;
        while (i <= Math.max(n, m)) {
            stringJoiner.add(String.valueOf(i));
            i = i + 2;
        }
        System.out.print(stringJoiner.length() == 0 ? "" : stringJoiner + "\r\n");
    }
}