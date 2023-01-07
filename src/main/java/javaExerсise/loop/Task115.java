package javaExerсise.loop;

public class Task115 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i + 1] <= nums[i]) {
                break;
            }
        }
        System.out.println(sum);
    }
}