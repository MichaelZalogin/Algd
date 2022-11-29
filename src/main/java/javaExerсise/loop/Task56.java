package javaExerсise.loop;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] < array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}