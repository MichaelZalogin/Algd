package javaExerсise.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num + 1, b = 0; b < 5; i++) {
            if (i % 2 == 1) {
                stringJoiner.add(String.valueOf(i));
                b++;
            }
        }
        System.out.println(stringJoiner);
    }
}