package L20;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareMethodTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String s1 = "B";
        String s2 = "A";
        String s3 = "C";
        String s4 = "D";
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 5};
        int[] array6 = {1, 2, 3, 5};
        char[] array4 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array5 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        char[] array7 = null;
        char[] array8 = null;
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array2, array6));
        System.out.println(Arrays.compare(array4, array5));
        System.out.println(Arrays.compare(array4, array7));
        System.out.println(Arrays.compare(array8, array7));
        System.out.println(Arrays.mismatch(array2, array1));
        System.out.println(Arrays.mismatch(array4, array5));
    }
}