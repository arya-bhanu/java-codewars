package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    public void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("fails", "ails", true);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
        check("ails", "fails", false);
        check("this", "fails", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = Kata.solution(str, ending);
        assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
    }
}