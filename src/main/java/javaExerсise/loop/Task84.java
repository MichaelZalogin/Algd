package javaExerсise.loop;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int[] f = new int[num];
        f[0] = a1;
        f[1] = a2;
        int summ = a1 + a2;
        for (int i = 2; i < num; i++) {
            f[i] = f[i - 1] + f[i - 2];
            summ += f[i];
        }
        System.out.println(summ);
    }
}
