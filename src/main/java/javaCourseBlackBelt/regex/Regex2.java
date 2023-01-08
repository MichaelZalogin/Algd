package javaCourseBlackBelt.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
("ABC"); Точное совпадение
("[ABC]"); Какой то из символов
("[^A-CD-FK-W]"); Символ из диапазона вместе с отрицанием
("^ACDFK"); Точное совпадение в начале строки
("ACDFK$"); Точное совпадение в конце строки
("ACDFK.."); Точка - любой символ
\\d - одна цифра
\\D - одна не цифра
\\w - буква, цифра или "_"
\\W -  НЕ буква, НЕ цифра и НЕ "_"
\\s -  пробел
\\S -  НЕ пробел
*/

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "MAPNDVORZPACEDFVB";
        Pattern pattern1 = Pattern.compile("PNDV....");
        Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + "  " + matcher1.group());
        }
    }
}