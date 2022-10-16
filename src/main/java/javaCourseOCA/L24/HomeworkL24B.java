package javaCourseOCA.L24;

public class HomeworkL24B {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Som");
        System.out.println(m1.name);
        m1.eat();
        m1.swim();
        m1.sleep();

        Speakable p1 = new Pingvin("Bob");
        p1.speak();

        Animal2 l1 = new Lev("Leon");
        System.out.println(l1.name);
        l1.eat();
        l1.sleep();

        Mammal l2 = new Lev("Leon2");
        System.out.println(l2.name);
        l2.eat();
        l2.run();
        l2.speak();
        l2.sleep();
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Пингивин любит есть рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void fly() {
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Лев, как и любой хищник, любит мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}