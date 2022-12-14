package javaExerсise.loop;

public class Task63 {
    public static void loop(int[] answers) {
        String result = "Нет";
        int count = 0;
        for (int answer : answers)
            if (answer == 1)
                count++;
        if (count * 2 > answers.length)
            result = "Да";
        System.out.println(count + ", " + result);
    }
}
