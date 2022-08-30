package javaCourseBlackBelt.collections.vector;

import java.util.Vector;

public class VectorExp {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Michael");
        vector.add("Igor");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
    }
}