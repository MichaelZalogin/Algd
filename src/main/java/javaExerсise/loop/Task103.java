package javaExerсise.loop;

public class Task103 {
    public static void loop(int[] num) {
        int min = (num[0] / 100) + (num[0] % 100 % 10) + (num[0] % 100 / 10);
        int count = 0;
        for (int i = 1; i < num.length; i++) {
            int tmp = (num[i] / 100) + (num[i] % 100 % 10) + (num[i] % 100 / 10);
            if (tmp < min) {
                min = tmp;
                count = i;
            }
        }
        System.out.println(num[count]);
    }
}