package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PluralTest {
    @Test
    public void BasicTest() {
        assertTrue(Plural.isPlural(0f));
        assertTrue(Plural.isPlural(0.5f));
        assertFalse(Plural.isPlural(1f));
        assertTrue(Plural.isPlural(100f));
    }
}