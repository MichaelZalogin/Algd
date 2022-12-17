package javaExerсise.loop;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ").setEmptyValue("0");
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                stringJoiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.printf("Количество: %d, Делители: %s\r\n", count, stringJoiner);
    }
}