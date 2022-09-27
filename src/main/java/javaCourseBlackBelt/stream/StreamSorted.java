package javaCourseBlackBelt.stream;

import java.util.Arrays;

public class StreamSorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));


        int result1 = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e /= 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result1);
    }
}