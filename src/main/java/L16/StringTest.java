package L16;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Hello").intern();
        String s2 = "Hello";
        System.out.println(s1 == s2);
    }
}
