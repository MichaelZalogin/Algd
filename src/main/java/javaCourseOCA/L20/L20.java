package javaCourseOCA.L20;

import java.util.ArrayList;
import java.util.List;

public class L20 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Privet");
        Car c1 = new Car();
        list1.add(c1);
        Student s1 = new Student();
        list1.add(s1);
        list1.add(new StringBuilder("ok"));
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("poka");
        list2.add("privet");
//        list2.add(s1);
        ArrayList<String> list3 = new ArrayList();
        ArrayList<StringBuilder> list4 = new ArrayList();
        List<String> list5 = new ArrayList<>();
    }
}
class Car {
}
class Student {
}