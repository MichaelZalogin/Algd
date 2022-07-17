package CourseOCA.L2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 127;

        short s1 = 1;
        short s2 = -32;

        int i1 = 21;
        int i2 = -43;

        long l1 = 1000000L;
        long l2 = 120032L;

        float f1 = 3.14F;
        float f2 = 3.2434f;

        double d1 = 5.5;
        double d2 = 54.0;
        double d3 = 54.0;

        char c1 = 'd';
        char c2 = 3000; //10
        char c3 = '\u303B'; //16
        System.out.println(c2 + " " + c3);

        boolean bo1 = true;
        boolean bo2 = false;

        int a1 = 60;//10
        int a2 = 0B111100;//2
        int a3 = 0743;//8
        int a4 = 0x3CF;//16
        int a5 = 1_000_000;
    }
}
