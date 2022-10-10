package javaExerсise.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional op = indexOf(data, el);
        if (op.isPresent()) {
            return 1;
        }
        return -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional op = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                op = Optional.of(el);
                break;
            }
        }
        if (op.isPresent()) {
            return op;
        }
        return op;
    }
}