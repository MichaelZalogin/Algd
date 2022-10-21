package javaExerсise.streamAPI;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((n, s) -> n * s).get();
    }
}