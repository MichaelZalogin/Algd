package javaExerсise.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int i = 0;
        for (int b = 0; b < 2 * num; b++) {
            stringJoiner.add(String.valueOf(i));
            i -= 8;
        }
        System.out.println(stringJoiner);
    }
}