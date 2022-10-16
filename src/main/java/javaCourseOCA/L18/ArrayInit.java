package javaCourseOCA.L18;

import java.util.*;

public class ArrayInit {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[][] array2 = new int[3][];
        /*
        Статическая инициализация
         */
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 4;
        array1[3] = 5;
        array2[2] = array1;
        array2[2][2] = 5;
        System.out.println(array1[3]);
        // Динамическая инициализация

        String[] array12 = {" ", " "};
        int[][] array13;
        array12 = new String[3];
        array13 = new int[3][];
        //Одномерный массив
        for (int i = 0; i < array12.length; i++) {
            array12[i] = "Privet" + i;
            System.out.println(array12[i]);
        }

        array13[0] = new int[5];
        array13[1] = new int[2];
        array13[2] = new int[7];
        // Двухмерный массив
        for (int i = 0; i < array13.length; i++) {
            for (int j = 0; j < array13[i].length; j++) {
                array13[i][j] = i + j;
                System.out.println(array13[i][j]);
            }
        }
        int[] array20 = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array20.length; i++) {
            System.out.print(array20[i] + " ");
        }
        System.out.println();

        Arrays.sort(array20);
        for (int i = 0; i < array20.length; i++) {
            System.out.print(array20[i] + " ");
        }

        int index1 = Arrays.binarySearch(array20, 9);
        System.out.println(index1);
    }
}