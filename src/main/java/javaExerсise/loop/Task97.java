package javaExerсise.loop;

public class Task97 {
    public static void loop(int[] num) {
        int min = num[0];
        int number = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                number = i;
            }
        }
        System.out.printf("Время: %d, номер: %d\r\n", min, number);
    }
}