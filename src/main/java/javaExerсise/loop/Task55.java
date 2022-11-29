package javaExerсise.loop;

public class Task55 {
    public static void loop(int[] array) {
        int even = 0;
        int notEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
                continue;
            }
            notEven++;
        }
        System.out.println("Четных: " + even + ", нечетных: " + notEven);
    }
}