package org.example;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    @Test
    public void sampleTests() {
        Assertions.assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
        Assertions.assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        Assertions.assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        Assertions.assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
        Assertions.assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
        Assertions.assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {3}));
        Assertions.assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {3,1}));
    }


    private final BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
        assertTrue(checker.isValid("([{}])"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("[({})](]"));
    }


}