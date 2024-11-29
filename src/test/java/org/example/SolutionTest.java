package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {
    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", Kata.alphabetWar("z"));
        assertEquals("Let's fight again!", Kata.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", Kata.alphabetWar("zzzzs"));
        assertEquals("Right side wins!", Kata.alphabetWar("dl"));
        assertEquals("Left side wins!", Kata.alphabetWar("wwwwwwz"));
    }
}