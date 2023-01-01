package javaExerсise.loop;

public class Task100 {
    public static void loop(int[] num) {
        int max = num[0] % 10 + num[0] / 10;
        int number = 0;
        int position = 0;
        for (int i = 1; i < num.length; i++) {
            number = num[i] % 10 + num[i] / 10;
            if (max < number) {
                max = number;
                position = i;
            }
        }
        System.out.println(num[position]);
    }
}
