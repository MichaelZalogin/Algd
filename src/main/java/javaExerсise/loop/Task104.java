package javaExerсise.loop;

public class Task104 {
    public static void loop(int[] num) {
        int max = num[0];
        int position = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                position = i;
            }
        }
        System.out.println(position);
    }
}