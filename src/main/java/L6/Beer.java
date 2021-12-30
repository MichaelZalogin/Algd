package L6;

public class Beer {
    public static void main(String[] args){
    int beerNum = 5;
    String word = "бутылок (бутылки)";
        while (beerNum > 0) {

        if (beerNum == 1) {
            word = "бутылка";}

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println("Возьми одну и выпей.");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
