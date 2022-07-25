package JavaCourseOCA.L19;

public class L19P3 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Math", "Econom", "History"};

        for (String a : students) {
            for (String b : exams) {
                System.out.println(a + " " + b);
            }
        }
        int[][] array1 = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                System.out.print(array1[i][j] + " ");
        }
        System.out.println("  ");
        for (int[] array2 : array1) {
            for (int i1 : array2) {
                System.out.print(i1 + " ");
            }
        }
        int[] array3 = {0, 6, 4, 1};
        for (int i = 0; i < args.length; i++) {
            array3[i] = 3;

        }
    }
}

