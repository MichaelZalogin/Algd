package L18;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] array1;//Declaration - null
        int[][] array4;//Declaration - null
        String[][] array2;//Declaration - null
        double[] array3;//Declaration - null
        double[][] array6;//Declaration - null

        array1 = new int[5][6];// Allocation
        array4 = new int[3][];// Allocation
        array2 = new String[2][6];// Allocation
        array3 = new double[3]; // Allocation
        array6 = new double[2][2];

        array2[0][1] = "Privet";
        array2[0][2] = "Poka";
        array2[0][3] = "ok";
        array2[0][4] = "okay";
        array2[0][5] = "good";
        array2[1][2] = "day";

        array3[0] = 3.14;
        array3[2] = 3.14;

        array6[0][0] = 3.14;
        array6[0][1] = 3.14;

        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array6[1] = array5;
    }
}

class Array2 {
    public static void main(String[] args) {
        String[] array10;
        int[][] array11;
        array10 = new String[3];
        array11 = new int[3][];
        // Динамическая инициализация
        for (int i = 0; i < array10.length; i++) {
            array10[i] = "privet " + i;
            System.out.println(array10[i]);
        }
        array11[0] = new int[5];
        array11[1] = new int[2];
        array11[2] = new int[7];

        for (int i = 0; i < array11.length; i++) {
            for (int j = 0; j < array11[i].length; j++) {
                array11[i][j] = i + j;
                System.out.println(array11[i][j]);
            }
        }
        int[] array13 = new int[7];
        int[] array14 = {1, 3, 2};
        int[] array15;
        array15 = new int[]{1, 3, 2, 4};
        int[] array16 = new int[]{1, 3, 5, 7};
    }
}

class Array3 {
    public static void main(String[] args) {
        int[] array18;
//        array18 = new int [-3]; // Exception in thread
        array18 = new int[3];
        array18[0] = 1;
        array18[1] = 2;
        array18[2] = 3;
//        array18 [3] = 5;// Array Index Out Of Bounds Exception
        int[][] array19;
        array19 = new int[3][];
//        System.out.println(array19[0][1]);//Null Pointer Exception
    }
}

class Array4 {
    public static void main(String[] args) {
        int array20[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array20.length; i++) {
            System.out.println(array20[i] + " ");
        }
        System.out.println(" ");
        Arrays.sort(array20);
        for (int i = 0; i < array20.length; i++) {
            System.out.println(array20[i] + " ");
        }
        System.out.println(" ");
        int index1 = Arrays.binarySearch(array20, 5);
        System.out.println(index1);
    }
}

class Array5 {
    public static void main(String[] args) {
        int array21[] = {1, 9, 3, -8, 0, 5, 4, 1, 3, 5, 6};
        int array22[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array23[] = array22;
        System.out.println(array21 == array22);// false
        System.out.println(array22 == array23);// true
        System.out.println(array21.equals(array22));// false
        array21[2] = 6;
        array22[5 - 3] = 5;
        array21[array23.length] = 66;
        for (int i = 0; i < array21.length; i++) {
            System.out.println(array21[i] + " ");
        }
    }
}

class Array6 {
    public static void max_min(double[] array25) {
        double max = array25[0];
        double min = array25[0];
        for (int i = 1; i < array25.length; i++) {
            if (array25[i] > max) {
                max = array25[i];
            }
            if (array25[i] < min) {
                min = array25[i];
            }
        }
        System.out.println("Минимальный элемент массива равен: " + max + " ,а минимальный элемент массива равен: " + min);
    }

    public static void main(String[] args) {
        double[] array26 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        max_min(new double[]{2.5, -1.3});
    }
}