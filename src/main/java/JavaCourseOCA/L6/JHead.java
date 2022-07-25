package JavaCourseOCA.L6;

public class JHead {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.println("Do");
        }
    }
}

class Beer {
    public static void main(String[] args) {
        int beerNum = 5;
        String word = "бутылок (бутылки)";
        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println("Возьми одну и выпей.");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}

class Generator {
    public static void main(String[] args) {
        String[] WordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
                "фронтэнд", "обоюдный", "любое ваше слово" };
        String[] WordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный" };
        String[] WordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования" };
        int OneLength = WordListOne.length;
        int TwoLength = WordListTwo.length;
        int ThreeLength = WordListThree.length;

        int rand1 = (int) (Math.random() * OneLength);
        int rand2 = (int) (Math.random() * TwoLength);
        int rand3 = (int) (Math.random() * ThreeLength);

        String phaise = WordListOne[rand1] + "  " + WordListTwo[rand2] + "  " + WordListThree[rand3];

        System.out.println("Все что нам нужно, - это " + phaise);
        System.out.println(WordListOne.length + "   " + WordListTwo.length + "    " + WordListThree.length);
    }
}