package javaExerсise.loop;

import java.util.StringJoiner;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        StringJoiner terminalResuilt = new StringJoiner(", ");
        for (int i = 0; i < diameter.length; i++) {
            if (diameter[i] < 27 && diameter[i] > 21
                    && weight[i] > 70 && weight[i] < 78) {
                terminalResuilt.add("Да");
                continue;
            }
            terminalResuilt.add("Нет");
        }
        System.out.println(terminalResuilt);
    }
}
