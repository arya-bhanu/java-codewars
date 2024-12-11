package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample tests")
class KataTest {


    @Test
    public void basicTests() {
        for (String[] trial : new String[][]{
                {"example(unwanted thing)example", "exampleexample"},
                {"example(unwanted thing)example", "exampleexample"},
                {"example (unwanted thing) example", "example  example"},
                {"a (bc d)e", "a e"},
                {"a(b(c))", "a"},
                {"hello example (words(more words) here) something", "hello example  something"},
                {"(first group) (second group) (third group)", "  "}})
            assertEquals(trial[1],  Kata.removeParentheses(trial[0]));
    }

    @Test
    @DisplayName("Increasing sequence: [1, 2, 4]")
    void testIncreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 1, 2, 4}), "Incorrect answer for [1, 2, 4]");
    }

    @Test
    @DisplayName("Increasing sequence: negative")
    void testIncreasing_2() {
        assertEquals(-35, Solution.findMissing(new int[]{-46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14}), "Incorrect answer for [1, 3, 4]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 2, 1]")
    void testDecreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 4, 2, 1}), "Incorrect answer for [4, 2, 1]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 3, 1]")
    void testDecreasing_2() {
        assertEquals(2, Solution.findMissing(new int[]{ 4, 3, 1}), "Incorrect answer for [4, 3, 1]");
    }

    @Test
    @DisplayName("Constant sequence: [1, 1, 1]")
    void testConstant() {
        assertEquals(1, Solution.findMissing(new int[]{ 1, 1, 1}), "Incorrect answer for [1, 1, 1]");
    }
}