package javaCourseOCA.L18;

public class Task6 {
    public static void maxAndMin(double array[]) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {
        double[] array2 = {4.0, 5.0, 7.0, 4.0, 2.0, 6.0, 7.0, 4.0, 3.0, 6.0, 7.0, 4.0, 3.0, 3431.0, 21.0, 23.0, 4.0, 54.0, -34.0};
        maxAndMin(array2);
    }
}