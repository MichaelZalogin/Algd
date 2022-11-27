package javaExerсise.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int a = n - m;
        if (a > 0) {
            a = m;
            while (a > 0) {
                stringJoiner.add(String.valueOf(n));
                n++;
                a--;
            }
        } else {
            a = n;
            while (a > 0) {
                stringJoiner.add(String.valueOf(m));
                m++;
                a--;
            }
        }
        System.out.println(stringJoiner);
    }
}