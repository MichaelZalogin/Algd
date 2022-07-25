package JavaCourseOCA.L24;

public class Human implements Jumpable {
    @Override
    public void jump() {
        System.out.println("A");
    }
}

class Animal implements Jumpable {
    @Override
    public void jump() {
        System.out.println("B");
    }
}

interface Jumpable {
    void jump();
}

class Test {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

interface A2 {
    void abc();
}

interface B2 extends A2, Jumpable {
    void def();
}