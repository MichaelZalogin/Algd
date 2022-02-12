package L20;

import java.util.ArrayList;
import java.util.Arrays;

public class L20P1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Poka");
        list1.add("Privet");
        list1.add("ok");
        list1.add(1, "Hello");
        for (String a : list1) {
            System.out.println(a);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            System.out.print(" ");
        }
        System.out.println(" " + list1.get(2));
        list1.set(1, "!!!");
        for (String a : list1) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Builder1");
        StringBuilder sb2 = new StringBuilder("Builder2");
        StringBuilder sb3 = new StringBuilder("Builder3");
        list2.add(sb1);
        list2.add(sb2);
        list2.add(sb3);
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i).append("!!!");
        }
        for (StringBuilder s : list2) {
            System.out.print(s + " ");
        }
    }
}