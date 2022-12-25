package javaExerсise.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 0; i < months; i++) {
            sum += sum * percent * 0.01;
        }
        System.out.printf("%.2f", sum);
    }
}
