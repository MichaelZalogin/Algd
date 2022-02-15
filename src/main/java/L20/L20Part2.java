package L20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L20Part2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String s1 = "one";
        String s2 = "two";
        String s3 = "three";
        String s4 = "four";
        String s5 = "five";
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        System.out.println("all = " + list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(s1);
        list2.add(s3);
        list2.add(s4);
        list1.removeAll(list2); // Удалить элементы второго листа из первого
        list1.add(s1);
        list1.add(s3);
        list1.add(s4);
        list1.retainAll(list2); // Сохранить элементы второго листа из первого, остальное удалить
        System.out.println("all = " + list1);
        boolean result = list1.containsAll(list2); //Содержит ли первый лист все значения листа 2
        System.out.println(result);
        List<String> list3 = list1.subList(1, 3);
        System.out.println("sublist = " + list3);
    }
}