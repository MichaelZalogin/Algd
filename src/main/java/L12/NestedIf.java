package L12;

public class NestedIf<a> {

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }

    void abc() {
        String str = null;
        int a = 10;
        if (a >= 10) {
            str = "Hello";
        }
        if (a < 10) {
            str = "Bye";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        new NestedIf().maximum(4, 7, 0);
    }
}