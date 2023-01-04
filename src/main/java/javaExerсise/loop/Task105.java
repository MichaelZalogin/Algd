package javaExerсise.loop;

public class Task105 {
    public static void loop(int[] num) {
        int maxSum = num[0] / 100 + num[0] % 100 / 10 + num[0] % 100 % 10;
        int sum;
        int position = 0;
        for (int i = 1; i < num.length; i++) {
            sum = num[i] / 100 + num[i] % 100 / 10 + num[i] % 100 % 10;
            if (sum > maxSum) {
                maxSum = sum;
                position = i;
            }
        }
        System.out.println(position);
    }
}