package javaExerсise.streamAPI;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(s -> (int) s)
                .sum();
    }
}