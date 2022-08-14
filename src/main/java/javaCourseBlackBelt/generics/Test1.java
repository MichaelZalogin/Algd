package javaCourseBlackBelt.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("ok");
        list.add(4);
        list.add(new StringBuilder("privet"));
        list.add(new Car());

        List list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("Ok");
        list2.add("fewfwf");
        for (Object s : list2) {
            System.out.println(((String) s).length());
        }

        List<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Poka");
        list3.add("Ok");
        list3.add("fewfwf");
    }
}

class Car {
}