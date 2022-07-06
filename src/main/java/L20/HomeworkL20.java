package L20;

import java.util.ArrayList;
import java.util.Collections;

public class HomeworkL20 {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> al = new ArrayList<>();
        for (String s1 : s) {
            if (!al.contains(s1)) {
                al.add(s1);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        HomeworkL20 hm1 = new HomeworkL20();
        hm1.abc("privet", "poka", "ok", "hello");
    }
}