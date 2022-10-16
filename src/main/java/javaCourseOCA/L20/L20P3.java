package javaCourseOCA.L20;

import java.util.*;

public class L20P3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        list1.add(sb4);
        list1.add(sb5);
        System.out.println(list1.toString());
        StringBuilder[] array1 = {sb1, sb3, sb3, sb4};
        List<StringBuilder> list2 = Arrays.asList(array1);
        System.out.println(list2);
        array1[0].append("!!!!");
        System.out.println(list2);
        array1[0] = new StringBuilder("!!!!");
        System.out.println(list2);
    }
}