package javaExerсise.loop;

public class Task118 {
    public static void loop(int num) {
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0) {
                count++;
            } else {
                sum += num % 10;
            }
            num = num / 10;
        }
        while ((num) != 0);
        System.out.println("Количество чет: " + count + ", сумма нечет: " + sum);
    }
}