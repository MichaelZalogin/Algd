package L22;

public class Inheritance2 {
    String name;
    String surname;
    String length;
    String behavior;

    Inheritance2(String n, String s, String l, String b) {
        this.name = n;
        this.surname = s;
        this.length = l;
        this.behavior = b;
    }
}

class Test5 extends Inheritance2 {
    public Test5() {
        super(" ", " ", " ", " ");
    }
}