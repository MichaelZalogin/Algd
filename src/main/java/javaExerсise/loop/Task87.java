package javaExerсise.loop;

import java.util.StringJoiner;

public class Task87 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        double pow = 0;
        for (int i = 10; i < 70; i++) {
            pow = Math.pow((i / 10 + i % 10), 3);
            if (pow == i * i) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
