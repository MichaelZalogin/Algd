package javaExerсise.loop;

import java.util.StringJoiner;

public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        while (b > a) {
            if (b / 100 > 0 && b > 0) {
                stringJoiner.add(String.valueOf(b));
            }
            b--;
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}