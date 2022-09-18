package javaCourseBlackBelt.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello123");
        arrayList.add("Hel");
        arrayList.add("Hello");
        arrayList.add("Hello567");
        arrayList.add("He");
        arrayList.removeIf((s -> s.length() > 4));
        System.out.println(arrayList);
    }
}
