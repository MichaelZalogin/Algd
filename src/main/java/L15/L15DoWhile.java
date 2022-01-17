package L15;

public class L15DoWhile {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        int money = 10;
        do {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
        }
        while (money > 50);// Clock loop
        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + " : " + minute);
                minute++;
            }
            hour++;
        }
        while (hour < 24);
    }
}

class L15DoWhile2 {
    public static void main(String[] args) {// Clock
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            while (minute < 60) {
                System.out.println(hour + " : " + minute);
                minute++;
            }
        }
    }
}
