package L25;
public class HW25 {}

abstract class Animal {
    Animal (String name) {
        this.name = name;
    }
    String name;
    abstract void eat ();
    abstract void sleep ();
}

abstract class Fish extends Animal {
        Fish(String name) {
        super(name);
        this.name = name;
    }
}