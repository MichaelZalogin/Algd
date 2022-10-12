package javaExerсise.lambda;

import java.util.Optional;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        Integer value = -1;
        if (optional.isPresent()) {
            value = optional.get();
        }
        return value;
    }
}