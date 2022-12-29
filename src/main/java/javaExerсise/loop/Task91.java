package javaExerсise.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int count = n3;
        String result = "";
        for (int i = 0; i < 3; i++) {
            if (!(n3 - n2 == n1 && n2 - n1 == n1)) {
                result = "Нет";
                break;
            }
            count += n1;
            stringJoiner.add(String.valueOf(count));
        }
        System.out.println(result == "Нет" ? result : stringJoiner.toString());
    }
}