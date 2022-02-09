package L19;

public class L19 {
    static void summa(int a, int b) {
        System.out.println(a + b);
    }

    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c);
    }

    public static void vararg_summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

}

class Programm1 {
    public static void main(String[] args) {
        System.out.println("нулевой аргумент массива: " + args[0]);
        System.out.println("длина массива: " + args.length);
    }
}