package javaExerсise.loop;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 10; i < 19; i++)
            if (i % 2 == 0)
                stringJoiner.add(String.valueOf(i));
        System.out.println(stringJoiner);
        System.out.println("Конец");
    }
}