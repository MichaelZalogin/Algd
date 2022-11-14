package javaExerсise.loop;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num + 1; i < num + 6; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}