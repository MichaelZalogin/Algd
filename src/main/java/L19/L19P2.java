package L19;

public class L19P2 {
    public static void main(String[] args) {
        int[] array1 = {0, 6, 4, 1};
        int[] array2 = {7, 6, 5, 6, 7, 6, 54, 3, 2};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for (int r : array1) {
            System.out.print(r + " ");
        }
        System.out.println(" ");
        int summa = 0;
        for (int a : array2) {
            summa += a;
        }
        System.out.println(summa);
    }
}