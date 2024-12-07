package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void SampleTests() {
        assertTrue(Kata.interlockable(9, 4), "a = 9\nb = 4\n");
        assertFalse(Kata.interlockable(3, 6), "a = 3\nb = 6\n");
        assertTrue(Kata.interlockable(5, 2), "a = 5\nb = 2\n");
        assertFalse(Kata.interlockable(7, 1), "a = 7\nb = 1\n");
        assertTrue(Kata.interlockable(0, 8), "a = 0\nb = 8\n");
    }

}