package javaExerсise.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }
}