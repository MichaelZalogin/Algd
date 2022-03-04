package L25;
public class HW25 {}

interface Speakable {
    default void speak (){
        System.out.println("Somebody speaks");
    };
}

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

    @Override
    void sleep() {
        System.out.println("Fish sleeps");
    }

    abstract void swim ();
}

abstract class Bird extends Animal implements Speakable {
    Bird (String name){
        super (name);
        this.name = name;
    }

    abstract void fly ();

    public void speak () {
        System.out.println(name + " sings");
    }
 }