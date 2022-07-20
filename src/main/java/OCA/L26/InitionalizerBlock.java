package OCA.L26;

public class InitionalizerBlock {
    String s1;

    {
        System.out.println("Hello");
        int a = 1;
        s1 = "Hello2";
        System.out.println(a);
    }

    static {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        InitionalizerBlock i1 = new InitionalizerBlock();
        InitionalizerBlock i2 = new InitionalizerBlock();
    }
}