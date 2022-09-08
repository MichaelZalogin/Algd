package javaCourseBlackBelt.nested_classes.local_inner_classes;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slozhenie implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slozhenie s = new Slozhenie();
        System.out.println(s.doOperation(5, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}