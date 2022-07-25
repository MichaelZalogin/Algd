package JavaCourseOCA.L19;

public class L19 {

    public static void vararg_summa1(int... a) {
        int summa1 = 0;
        for (int i = 0; i < a.length; i++) {
            summa1 += a[i];
        }
        System.out.println(summa1);
    }

    public static void vararg_summa2(int[] a) {
        int summa2 = 0;
        for (int i = 0; i < a.length; i++) {
            summa2 += a[i];
        }
        System.out.println(summa2);
    }

    public static void abc(int[]... array) {
    }

    public static void main(String[] args) {
        vararg_summa1(6, 3, 10);
        vararg_summa2(new int[]{6, 3, 10});
    }
}