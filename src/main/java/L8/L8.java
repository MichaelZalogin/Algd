package L8;

// Non-Access Modifier (final,static)
public class L8 {
    public final int a;// Read Only (const)
    public int v = 10;

    L8() {
        a = 15;// Значение константы можно задать в конструкторах.
    }

    L8(int a1) {
        a = 5;// Инициализация до использования (before use)
    }

    public void method(final short s) {
        final byte b;// Local variable without default meaning!
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        L8 Test1 = new L8();
        Test1.v *= 2;
        Test1.v = Test1.a * Test1.v;
        System.out.println(Test1.v);
        System.out.println(Test1.a);
    }
}

class Car {
    String Color = "Blue";
    String Engine = "V6";
}

class Human {
    String Name = "Ivan";
    //final
    Car Machine = new Car();

    public static void main(String[] args) {
        Human H1 = new Human();
        H1.Machine = new Car();
        H1.Machine = new Car();
        H1.Machine.Color = "Black";
    }
}

class Student {

    String Name;
    int Course;
    static int Count;

    protected Student(String Name2, int Course2) {
        Count++;
        Name = Name2;
        Course = Course2;
        System.out.println("Armeni number: " + Count + " has been created ");
    }

    protected final static void Method2() {
        System.out.println("total Armeni: " + Student.Count + " humans");
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Armeni1", 3);
        Student st2 = new Student("Armeni2", 2);
        Student st3 = new Student("Armeni3", 1);
        Student st4 = new Student("Armeni4", 7);
        Student.Method2();
    }
}

class HomeWorkStaticNonAccessModifier {
    protected static int Method5(int a, int b, int c) {
        int umnozhenie = a * b * c;
        return umnozhenie;
    }

    protected static void Method6(int a, int b) {
        int delenie = a / b;
        System.out.println(delenie);
        System.out.println(a % b);
    }
}

class HomeWorkStaticNonAccessModifierTest {
    public static void main(String[] args) {
        HomeWorkStaticNonAccessModifier.Method5(1, 3, 4);
        HomeWorkStaticNonAccessModifier.Method6(10, 3);
    }
}

class HomeWorkStaticNonAccessModifier1 {
    static final double pi = 3.14;

    double Method7(double r) {
        double PloshadKruga = r * r * pi;
        return PloshadKruga;
    }

    static double Method8(double r) {
        double DlinaoOkryzhnocti = 2 * pi * r;
        return DlinaoOkryzhnocti;
    }

    void ShowInfo(double r) {
        System.out.println("радиус круга " + r + " ; Площадь круга :" + Method7(r) +" ; Длина дуги: "+ Method8(r)+" ; ");
    }
}
class HomeWorkStaticNonAccessModifier1Test {
    public static void main(String[] args) {
        HomeWorkStaticNonAccessModifier1 NonStaticMethod = new HomeWorkStaticNonAccessModifier1();
        NonStaticMethod.ShowInfo(54);
    }
}

