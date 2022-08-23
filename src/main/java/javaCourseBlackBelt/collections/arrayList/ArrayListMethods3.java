package javaCourseBlackBelt.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {

    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(21, "Ivan", "Treg", 21243);
        Employee emp2 = new Employee(15, "Pavel", "Petrov", 4334);
        Employee emp3 = new Employee(123, "Victor", "Sidorov", 8142);
        Employee emp4 = new Employee(321, "Nikolay", "Ivanov", 3232);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        System.out.println(list1);

        List<Employee> list2 = new ArrayList<>();
        Employee emp5 = new Employee(32, "Fedor", "Minin", 21243);
        Employee emp6 = new Employee(43, "Andrey", "Kustov", 4334);
        Employee emp7 = new Employee(34, "Vasily", "Krucov", 8142);
        Employee emp8 = new Employee(38, "Semen", "Victorov", 3232);
        list2.add(emp5);
        list2.add(emp6);
        list2.add(emp7);
        list2.add(emp8);
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
        System.out.println(list2.indexOf(emp7));
        System.out.println(list2.lastIndexOf(emp7));
        System.out.println(list2.lastIndexOf(emp7));
        System.out.println(list2.size());
        System.out.println(list1.isEmpty());
    }
}