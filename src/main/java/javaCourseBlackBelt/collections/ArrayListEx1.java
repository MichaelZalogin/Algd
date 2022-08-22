package javaCourseBlackBelt.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Ivan");
        arrayList1.add("Marya");
        arrayList1.add("Petr");
        arrayList1.add("Pavel");
        System.out.println(arrayList1);
        System.out.println("===================================");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Petr");
        arrayList2.add("Pavel");
        System.out.println(arrayList2);
        System.out.println("===================================");
        List<String> arrayList3 = new ArrayList<>(arrayList2);
        System.out.println(arrayList3);
        System.out.println("===================================");
    }
}