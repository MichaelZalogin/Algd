package L26;

public class L26 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 8) {
            if ( (i % 2) == 0 )
            continue;
            System.out.println(i);
            i++;
        }
    }
}
