package javaExerсise.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int count = 0;
        int negative = 0;
        for (int digit : nums) {
            if (digit > 0) {
                count++;
                continue;
            }
            if (digit < 0) {
                count--;
            }
        }
        System.out.println(count == 0 ? "Да" : "Нет");
    }
}