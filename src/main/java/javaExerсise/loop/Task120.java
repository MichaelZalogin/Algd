package javaExerсise.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        int tmp;
        StringJoiner result = new StringJoiner(" ");
        while (num != 0) {
            tmp = num % 10;
            num /= 10;
            result.add(String.valueOf(num));
        }
        System.out.println(result);
    }
}