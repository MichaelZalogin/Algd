package javaExerсise.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (sum + num < 150) {
                sum += num;
                count++;
            }
        }
        System.out.println(String.format("Сумма: %d, количество: %d", sum, count));
    }
}