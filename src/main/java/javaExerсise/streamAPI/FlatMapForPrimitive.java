package javaExerсise.streamAPI;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(s -> Arrays.stream(s))
                .sum();
    }
}