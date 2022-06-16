package L8;

public class FinalAndStaticModifiers {
    public final int a;

    FinalAndStaticModifiers() {
        a = 10;
    }

    FinalAndStaticModifiers(boolean b) {
        a = 20;
    }

    public static void main(String[] args) {
        FinalAndStaticModifiers t1 = new FinalAndStaticModifiers(true);
        t1 = new FinalAndStaticModifiers();

//        t1.a *=2;
        System.out.println(t1.a);
    }
}

class Car2 {
    String color;
    String engine;
}

class Human1 {
    String name;
    Car2 c1 = new Car2();

    public static void main(String[] args) {
        Human1 person = new Human1();
        person.c1.color = "Black";
        person.c1.engine = "V6";
    }
}