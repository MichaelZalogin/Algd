package javaExerсise.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalOrlElseTest {

    @Test
    public void test1() {
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }

    @Test
    public void test2() {
        assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
    }
}