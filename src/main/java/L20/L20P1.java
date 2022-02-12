package L20;

import java.util.ArrayList;

public class L20P1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Poka");
        list1.add("Privet");
        list1.add("ok");
        list1.add(1,"Hello");
        for (String a : list1){
            System.out.println(a);
        }
        for (int i = 0; i<list1.size(); i++){
            System.out.print(list1.get(i));
            System.out.print(" ");
        }
        System.out.println(" " + list1.get(2));
    }
}
