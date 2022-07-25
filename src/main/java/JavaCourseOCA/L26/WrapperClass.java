package JavaCourseOCA.L26;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        Long l = 50L; //Autoboxing
        int a = list1.get(0);
        Integer i1 = new Integer(3);

        switch (i1) {
            case 2:
                System.out.println("i2");
        }

        String s1 = "50";
        int i3 = Integer.parseInt(s1);//Парсинг в примитив
        Integer i4 = i3;
    }
}