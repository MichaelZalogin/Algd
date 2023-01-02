package javaExerсise.loop;

public class Task102 {
    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        String maxValue = max > 0 ? Integer.toString(max) : "Нет";
        String minValue = min < 0 ? Integer.toString(min) : "Нет";
        System.out.println("Max: " + maxValue + ", min: " + minValue);
    }
}
