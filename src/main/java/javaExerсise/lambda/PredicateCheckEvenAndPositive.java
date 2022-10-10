package javaExerсise.lambda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
        return check(s -> s > 0 && s % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}