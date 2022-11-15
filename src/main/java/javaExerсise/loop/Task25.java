package javaExerсise.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int i = 7;
        for (int b = 0; b < num; b++) {
            stringJoiner.add(String.valueOf(i));
            i += 4;
        }
        System.out.println(stringJoiner);
    }
}