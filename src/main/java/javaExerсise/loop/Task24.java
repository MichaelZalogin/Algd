package javaExerсise.loop;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num - 10; i < num - 30; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}