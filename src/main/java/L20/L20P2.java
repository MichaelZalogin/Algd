package L20;

import java.util.ArrayList;

public class L20P2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> sb1 = new ArrayList<>();
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("String1");
        s1.add("String2");
        s1.add("String3");
        sb1.add(new StringBuilder("StringBuilder1"));
        sb1.add(new StringBuilder("StringBuilder2"));
        sb1.add(new StringBuilder("StringBuilder3"));
        System.out.println(sb1.indexOf(new StringBuilder("StringBuilder1")));
        System.out.println(s1.indexOf("String2"));
        for (String st1 : s1) {
            System.out.print(st1 + " ");
        }
        System.out.println(" ");
        for (StringBuilder sb2 : sb1) {
            System.out.print(sb2 + " ");
        }
    }
}
