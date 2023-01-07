package javaExerсise.loop;

public class Task116 {
    public static void loop(int num) {
        int summ = 0;
        int count = 0;
        do {
            count++;
            summ += num % 10;
            num = num / 10;
        }
        while ((num) != 0);
        System.out.println("Количество: " + count + ", сумма: " + summ);
    }
}