package javaExerсise.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            if (first[i] == second[i]) {
                break;
            }
            sumFirst += first[i];
            sumSecond += second[i];
        }
        System.out.println("Сумма1: " + sumFirst + ", сумма2: " + sumSecond);
    }
}
