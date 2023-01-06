package javaExerсise.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int sum = 0;
        for (int i = num + 1; sum + i < num * num; i++) {
            sum += i;
            stringJoiner.add(String.valueOf(i));
        }
        if (stringJoiner.length() == 0) {
            System.out.print("");
        } else {
            System.out.println(stringJoiner);
        }
    }
}