package L25;

public class L25P3 {}

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
        short s3 = (short)i3;//casting
        long l1 = 1;
        int i4 = (int)l1; //casting
        char c10 = (char) -8;
        System.out.println(c10);
    }
}