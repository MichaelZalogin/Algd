package javaExerсise.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void whenArrayContainsEvenNumbers() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 3, 12, 22, 34, 2, 14};
        int result = Task1.searchDigit(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    void whenArrayContainsNotEvenNumbers() {
        int[] array = {1, 3, 5, 7, 9, 11, 2, 13, 15};
        int result = Task1.searchDigit(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    void whenArrayContainsNotEvenNumbers2() {
        int[] array = {1, 2, 3, 5, 7, 9, 11, 13, 15};
        int result = Task1.searchDigit(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    void whenArrayContainsEvenNumbers2() {
        int[] array = {2, 3, 4, 6, 8, 10, 12, 14, 16, 12, 22, 34, 2, 14};
        int result = Task1.searchDigit(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}