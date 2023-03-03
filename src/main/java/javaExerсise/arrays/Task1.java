package javaExerсise.arrays;

public class Task1 {
    public static int searchDigit(int[] array) {
        int result = 0;
        int summ = array[0] % 2 + array[1] % 2 + array[2] % 2;

        /** если сумма первых трех остатков от деления больше 1,
         * то ищем четный элемент в массиве */
        if (summ > 1) {
            for (int element : array) {
                if (element % 2 == 0) {
                    result = element;
                    break;
                }
            }
        }

        /** если сумма первых трех остатков от деления меньше или равна 1,
         * то ищем нечетный элемент в массиве */
        if (summ <= 1) {
            for (int element : array) {
                if (element % 2 == 1) {
                    result = element;
                    break;
                }
            }
        }
        return result;
    }
}

