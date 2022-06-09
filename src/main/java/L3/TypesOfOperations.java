package L3;

public class TypesOfOperations {
    public static void main(String[] args) {
        int x1, x2, x3 = 4;
        System.out.println(x1 = 3);
        System.out.println(x2 = 4 + x1);
        int a = 10;
        int b = 3;
        System.out.println(a/b);
        double a1 = 10;
        double b1 = 3;
        System.out.println(a1/b1);
        System.out.println(a%b);
        double a2 = 11.5;
        double b2 = 3.2;
        double c2 = a2%b2;
        System.out.println(c2++);
        System.out.println(c2);
        int z = a + ++b;
        System.out.println(z);
        System.out.println(z);
        z += 12;
        z /= 11;
        System.out.println(z);
        boolean bo1 = a>b;
        System.out.println(bo1);
    }
}