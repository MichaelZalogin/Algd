package javaExerсise.loop;

public class Task86 {
    public static void loop(int num) {
        String result = "Нет";
        int unit = num % 10;
        int decimal = num / 10;
        num *= 2;
        if (unit + decimal == (num % 10) + (num / 10)) {
            result = "Да";
        }
        System.out.println(result);
    }
}