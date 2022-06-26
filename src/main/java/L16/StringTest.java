package L16;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Hello").intern();
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4.intern() == s5.intern());
        System.out.println(s5 == s3);
    }
}
