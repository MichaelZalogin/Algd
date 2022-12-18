package javaExerсise.loop;

public class Task67 {
    public static void loop(int num) {
        String result = num == 1 ? "Нет" : "Да";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = "Нет";
            }
        }
        System.out.println(result);
    }
}