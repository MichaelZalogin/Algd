package javaExerсise.loop;

public class Task82 {
    public static void loop(int[] promo, int[] ticket) {
        int summ = 0;
        int simple = 0;
        for (int i = 0; i < promo.length; i++) {
            summ += promo[i] + ticket[i];
            simple += promo[i] / 10;
        }
        System.out.println("Продано билетов: " + summ + ", выдано бесплатно: " + simple);
    }
}
