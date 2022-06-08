package L2;

public class L2Homework {
    public static void main(String[] args) {

        byte b1 = 0b1100;
        byte b2 = 12;
        byte b3 = 0_14;
        byte b4 = 0xC;

        short s1 = -0b10100010100;
        short s2 = -1300;
        short s3 = -0_2424;
        short s4 = -0x514;

        int i1 = 0;

        long l1 = 0b1110_1011_0111_1001_1010_0010_101;
        long l2 = 123456789L;
        long l3 = 0_726746425L;
        long l4 = 0x75BCD15L;

        float f1 = 1.4f;
        float f2 = 1.34f;
        System.out.println(f1 + " " + f2);

        double d1 = 32.5;
        double d2 = 34.0;
        System.out.println(d1 + " " + d2);

        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1 + " " + bo2);

        char c1 = 'c';
        char c2 = 400;
        char c3 = '\u3FC4';
        System.out.println(c1 + " " + c2 + " " + c3);

    }
}