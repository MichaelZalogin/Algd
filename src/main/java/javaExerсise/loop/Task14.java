package javaExerсise.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        while (a < b) {
            if (a > 0 && a / 10 > 0) {
                joiner.add(String.valueOf(a));
            }
            a++;
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}