package javaExerсise.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional op = Optional.ofNullable(value);
        if (op.isPresent()) {
            for (var a : strings) {
                if (value.equals(a)) {
                    op = Optional.ofNullable(value);
                }
            }
        }
        return op;
    }
}
