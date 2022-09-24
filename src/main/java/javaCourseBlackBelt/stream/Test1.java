package javaCourseBlackBelt.stream;

import java.util.*;
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

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));


        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Hello1");
        stringSet.add("Hello21");
        stringSet.add("Hello323");
        stringSet.add("Hello4132");
        stringSet.add("Hello54343");
        System.out.println(stringSet);
        Set<Integer> stringSet2 = stringSet.stream().map(i -> i.length()).collect(Collectors.toSet());
        System.out.println(stringSet2);
    }
}