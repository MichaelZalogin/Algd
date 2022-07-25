package JavaCourseOCA.L3;

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
        double c2 = a2 % b2;
        System.out.println(c2++);
        System.out.println(c2);
        int z = a + ++b;
        System.out.println(z);
        System.out.println(z);
        z += 12;
        z /= 11;
        System.out.println(z);
        boolean bo1 = a > b;
        System.out.println(bo1);
        boolean a5 = true;
        boolean b5 = false;
        System.out.println( (a5 && b5) || a5 );
        int f = 15;
        int g = 13;
        boolean c5 = f < g || f == g++;
        // Первое условие  false, провряем второе. В этом случае g увеличилась до 15
        boolean c6 = f > g || f == g++;
        // Первое условие  true, второе не проверяется. В этом случае g не увеличивается.
        boolean c7 = f > g || f == g++;
        // Выполняются оба условия независимо от результата. В этом случае g увеличивается.
        int d = 9;
        int l = 12;
        System.out.println(d & l); //побитовые операции
    }
}