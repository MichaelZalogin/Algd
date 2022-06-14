package L6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(int i1, int b) {
        System.out.println(i1 + b);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(int i1, boolean b1) {
        System.out.println(b1);
    }

    void show(boolean b1, int i1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String s = "Privet!!!";
        mo.show(s);
    }
}