package javaExerсise.loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 300; i <= 325; i++) {
            if (i % 100 / 10 != 0 && i % 100 % (i / 100) == 0) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}