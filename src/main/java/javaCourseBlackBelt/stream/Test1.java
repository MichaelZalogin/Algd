package javaCourseBlackBelt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello1");
        list.add("Hello21");
        list.add("Hello323");
        list.add("Hello4132");
        list.add("Hello54343");

        List<String> list2 = new ArrayList<>();
        list2.add("Hello1");
        list2.add("Hello21");
        list2.add("Hello323");
        list2.add("Hello4132");
        list2.add("Hello54343");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list);

        List<Integer> list3 = list2.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list3);
    }
}