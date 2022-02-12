package L16;

public class L162 {
    public static void main(String[] args) {
        String s1 = "Privet";
        System.out.println(s1.isBlank());
        String s2 = "       ";
        System.out.println(s2.isBlank());
        String s3 = " ";
        System.out.println(s3.isEmpty());
        String s4 = "";
        System.out.println(s4.isEmpty());
//        String s5 = null;
//        System.out.println(s5.isEmpty());
        String s5 = "   privet     ";
        System.out.println(s5.trim());
        String s6 = "   privet      ";
        System.out.println(s5.strip());
        String s7 = "   privet      ";
        System.out.println(s7.stripLeading());
        String s8 = "   privet      ";
        System.out.println(s8.stripTrailing());
        String s9 = "poka";
    }
}
