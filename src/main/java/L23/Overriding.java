package L23;

public class Overriding {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("М");
    }

    public static void main(String[] args) {
        Overriding ov1 = new Overriding();
        Animal a1 = new Mouse();
        ov1.abc(a1);
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}