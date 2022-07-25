package JavaCourseOCA.L25;

public class L25P3 {
}

class Widening {
    public static void main(String[] args) {
        byte b = 10;//widening
        int a = b;//widening
        System.out.println(7);
        byte b2 = 3;// narrowing
        short s1 = -6;// narrowing
        char c1 = 100;// narrowing
        final int i2 = 33;
        short s2 = i2;
        int i3 = 3;
        short s3 = (short) i3;//casting
        long l1 = 1;
        int i4 = (int) l1; //casting
        char c10 = (char) -8;
        System.out.println(c10);
        int i12 = (int) 3.14;
        System.out.println(i12);
        double d3 = 45535344.434;
        byte b5 = (byte) d3;
        System.out.println(b5);
        int i5 = 2147483647;
        System.out.println(i5 + 1);
    }
}

class Numeric_promotion {
    public static void main(String[] args) {
        int i1 = 12;
        long l1 = 37;
        System.out.println(i1 + l1);
        i1 *= l1;
        float f1 = 3.14f;
        int i2 = 14;
        System.out.println(f1 + i2);

        byte b1 = 6;
        short s1 = 5;
        char c = 5;
        System.out.println(b1 + s1 + c);
        System.out.println(b1++);
    }
}