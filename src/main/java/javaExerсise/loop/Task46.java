package javaExerсise.loop;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1000; i <= 1500; i++) {
            if (i % 1000 / 10 == num) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}