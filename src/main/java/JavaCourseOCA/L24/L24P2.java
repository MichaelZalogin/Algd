package JavaCourseOCA.L24;

public class L24P2 {
}

interface i1 {
    void abc();

    default void def() {
        System.out.println("DEF");
    }

    static void ghi() {
        System.out.println("Static GHI");
    }
}

class Z2 implements i1 {
    @Override
    public void abc() {
        System.out.println("ABC");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        i1.ghi();
    }
}