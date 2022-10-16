package javaCourseOCA.L23;

public class Overriding {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("М");
    }

    public static void main(String[] args) {
        Overriding ov1 = new Overriding();
        Mouse a1 = new Mouse();
        ov1.abc(a1);
        a1.getName();
        System.out.println(a1.tail);
    }
}

class Animal {
    static String tail = "One";

    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    static int tail = 1;

    void getName() {
        System.out.println("Mouse");
    }
}