package L19;

public class VarArguments {
    public static void intAgrs(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(sum);
        }
    }

    public static void intAgrs1(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            System.out.println(sum);
        }
    }

    public static void abc(int[]... a) {
        //some code
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        intAgrs(array1);
        intAgrs1(1, 2, 3, 4, 5, 6, 7, 8);
    }
}