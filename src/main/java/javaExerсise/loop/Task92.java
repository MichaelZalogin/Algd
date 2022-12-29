package javaExerсise.loop;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        StringJoiner stringJoiner = new StringJoiner(" ").setEmptyValue("Нет чисел");
        int step = a2 / n2;
        for (int i = n1; i < n2 - 1; i++) {
            a1 += step;
            stringJoiner.add(String.valueOf(a1));
        }
        System.out.println(stringJoiner);
    }
}