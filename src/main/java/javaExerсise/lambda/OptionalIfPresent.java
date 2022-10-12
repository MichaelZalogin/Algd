package javaExerсise.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        Optional<Integer> op = max(data);
        if (op.isPresent()) {
            System.out.println("Max: " + op.get());
        }
    }

    private static Optional<Integer> max(int[] data) {

        Optional<Integer> op = Optional.empty();
        if (data.length > 0) {
            return op.of(Arrays.stream(data).max().getAsInt());
        }
        return op;
    }
}