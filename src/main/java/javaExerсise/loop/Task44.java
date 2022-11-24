package javaExerсise.loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int a, b, c, d;
        double e;
        for (int i = 100; i <= 999; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 100 % 10;
            d = 100 * c + 10 * b + a;
            e = Math.sqrt(i * d);
            if (e == Math.round(e) && b != 0 && d != i) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}