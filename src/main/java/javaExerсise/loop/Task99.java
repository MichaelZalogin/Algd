package javaExerсise.loop;

public class Task99 {
    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        int summ = num[0];
        for (int i = 1; i < num.length; i++) {
            summ += num[i];
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println((summ / num.length) < (min + max) / 2 ? "Больше" : "Нет");
    }
}