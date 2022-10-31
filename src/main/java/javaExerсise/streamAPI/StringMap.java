package javaExerсise.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(s -> s.concat(".java"))
                .collect(Collectors.toList());
    }
}