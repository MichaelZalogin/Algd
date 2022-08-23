package javaCourseBlackBelt.collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);
        List<String> al1 = new ArrayList<>();
        al1.add("Name1");
        al1.add("Name2");
        al1.add("Name3");
        al1.add("Name4");
        String[] array2 = al1.toArray(new String[0]);
        for (String s : array2) {
            System.out.println(s);
        }
    }
}