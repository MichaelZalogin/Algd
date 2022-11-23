package javaExerсise.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num, b = 0; b < 5; b++) {
            i = i - 6;
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}