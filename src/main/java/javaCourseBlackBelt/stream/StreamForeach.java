package javaCourseBlackBelt.stream;

import java.util.Arrays;

public class StreamForeach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(e1 -> {
            e1 *= 2;
            System.out.println(e1);
        });

        Arrays.stream(array).forEach(System.out::println);
    }
}