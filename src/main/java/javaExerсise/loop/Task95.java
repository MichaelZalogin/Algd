package javaExerсise.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int countStudents = 0;
        int countMath = 0;
        int countInfo = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2 < 7) {
                continue;
            }
            countStudents++;
            if (math[i] > info[i]) {
                countMath++;
            } else {
                countInfo++;
            }
        }
        System.out.println(String.format("Зачислено: %d, ФМ: %d, ФИ: %d", countStudents, countMath, countInfo));
    }
}