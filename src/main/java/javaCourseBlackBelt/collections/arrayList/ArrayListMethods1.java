package javaCourseBlackBelt.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Ivan");
        arrayList1.add("Marya");
        arrayList1.add("Petr");
        arrayList1.add("Pavel");
        arrayList1.add(1, "Misha");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.size());
        arrayList1.set(1, "Victor"); // replace
        System.out.println(arrayList1);
        arrayList1.remove("Victor");
        System.out.println(arrayList1);
    }
}