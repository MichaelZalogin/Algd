package javaCourseBlackBelt.collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Marya");
        arrayList.add("Kolya");
        arrayList.add("Elena");

        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Iterator<String> iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
        }
    }
}