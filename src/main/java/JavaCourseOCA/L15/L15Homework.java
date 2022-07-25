package JavaCourseOCA.L15;

public class L15Homework {
    public static void clock() {
        HOURS:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTES:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break HOURS;
                }
                SECOND:
                for (int second = 0; second <= 59; second++) {
                    if ((second * hour) > minute) {
                        continue MINUTES;
                    }
                    System.out.println(hour + " : " + minute + " : " + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        clock();
    }
}

class  L15 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
            System.out.println(money);
        }
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            a++;
        }
        int x = 5;
        while (++x < 10) {
            x++;
        }
        System.out.println(x);
        int t = 5;
        while (t == 10) {
            System.out.println("Привет");
        }
    }
}