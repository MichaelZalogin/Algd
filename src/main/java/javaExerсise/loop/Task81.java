package javaExerсise.loop;

public class Task81 {
    public static void loop(int num) {
        int tens = num / 10;
        int units = num % 10;
        int summ = 0;
        for (int i = Math.min(tens, units); i <= Math.max(tens, units); i++) {
            summ += i;
        }
        System.out.println(summ);
    }
}
