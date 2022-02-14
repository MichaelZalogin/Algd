package L20;

import java.util.*;
public class L20P4 {
    public static void main(String[] args) {
        String sb1 = new String("A");
        String sb2 = new String("B");
        String sb3 = new String("C");
        String sb4 = new String("D");
        String sb5 = new String("E");
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = list1;
        list1.add(sb3);
        list1.add(sb1);
        list1.add(sb4);
        list1.add(sb2);
        list1.add(sb5);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list1.equals(list2));
        ArrayList <String> list3 = new ArrayList<>();
        list3.add(sb3);
        list3.add(sb1);
        list3.add(sb4);
        list3.add(sb2);
        list3.add(sb5);
        Collections.sort(list3);
        System.out.println(list1.equals(list3));
    }
}