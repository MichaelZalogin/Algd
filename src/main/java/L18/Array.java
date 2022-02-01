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

    }
}