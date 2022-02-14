package L20;

import java.util.ArrayList;

public class L20P2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> sb1 = new ArrayList<>();
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("String1");
        s1.add("String2");
        s1.add("String3");

        System.out.println(sb1.indexOf(new StringBuilder("StringBuilder1")));
        System.out.println(s1.indexOf("String2"));
        System.out.println(s1.lastIndexOf("String2"));
        System.out.println(s1.contains("String2"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        System.out.println(s1.toString());
        System.out.println(sb1.toString());
        ArrayList<StringBuilder> sb2 = (ArrayList<StringBuilder>) sb1.clone();
        System.out.println(sb2 == sb1);
        System.out.println(sb1.get(0) == sb2.get(0));
        sb1.get(0).append("!!!");
        System.out.println(sb1.get(0));
    }
}
