package javaExerсise.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        int tmp;
        String result = "Нет";
        while (num != 0) {
            tmp = num % 10;
            num /= 10;
            if (tmp == digit) {
                result = "Да";
                break;
            }
        }
        System.out.println(result);
    }
}