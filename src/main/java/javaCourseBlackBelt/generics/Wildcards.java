package javaCourseBlackBelt.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("Hello");
        List<? extends Number> list15 = new ArrayList<Integer>();
//        list15.add(21);

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        list1.add(3.17);
        showListInfo(list1);
    }

    static void showListInfo(List<?> list) {
        System.out.println("Лист содержит элементы: " + list);
    }
}