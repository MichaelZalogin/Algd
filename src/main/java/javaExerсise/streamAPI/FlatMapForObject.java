package javaExerсise.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.toList());
    }
}