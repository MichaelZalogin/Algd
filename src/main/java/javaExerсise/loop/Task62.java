package javaExerсise.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        String result = "Нет";
        int count = 0;
        for (int i = 0; i < grades.length; i++)
            if (grades[i] < 3)
                count++;
        if (count * 2 > amount)
            result = "Да";
        System.out.println(result);
    }
}