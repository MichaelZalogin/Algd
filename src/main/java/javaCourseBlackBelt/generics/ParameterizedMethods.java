package javaCourseBlackBelt.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("index0");
        list2.add("index1");
        list2.add("index2");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}
