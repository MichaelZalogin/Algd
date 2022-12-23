package javaExerсise.loop;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0;
        double badAvg = 0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int grade : grades) {
            if (grade > 2) {
                sumGood += grade;
                good++;
                continue;
            }
            sumBad += grade;
            bad++;
        }
        if (bad != 0)
            badAvg = (double) sumBad / bad;
        if (good != 0)
            goodAvg = (double) sumGood / good;
        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }
}