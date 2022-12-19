package javaExerсise.loop;

public class Task68 {
    public static void loop(int num1, int num2) {
        int count = 0;
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0) {
                count++;
            }
            if (num2 % i == 0) {
                count--;
            }
        }
        System.out.println(count == 0 ? "Да" : "Нет");
    }
}