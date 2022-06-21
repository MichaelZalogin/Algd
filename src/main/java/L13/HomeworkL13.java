package L13;

public class HomeworkL13 {
}

class Month {
    public static void month(int i) {
        switch (i) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Month.month(9);
    }
}