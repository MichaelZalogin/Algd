package javaExerсise.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int countStudent = 0;
        int countGrade = 0;
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            if (first[i] + second[i] >= 80) {
                countStudent++;
                countGrade += first[i] + second[i];
            }
        }
        System.out.println(String.format("В финале: %d, сумма баллов: %d", countStudent, countGrade));
    }
}