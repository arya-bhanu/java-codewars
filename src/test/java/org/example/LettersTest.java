package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LettersTest {
    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        assertEquals("11000000000000000000000001", Letters.search("a **&  bZ"), "Failed for input: 'a **&  bZ'");
        assertEquals("11101000000000000000000001", Letters.search("Abc e  $$  z"), "Failed for input: 'Abc e  $$  z'");
        assertEquals("10000010000000000101000000", Letters.search("!!a$%&RgTT"), "Failed for input: '!!a$%&RgTT'");
        assertEquals("11111111111111111111111111", Letters.search("abcdefghijklmnopqrstuvwxyz"), "Failed for input: 'abcdefghijklmnopqrstuvwxyz'");
        assertEquals("10000000000000000000000000", Letters.search("aaaaaaaaaaa"), "Failed for input: 'aaaaaaaaaaa'");
        assertEquals("00010111000000000001000010", Letters.search("&%&%/$%$%$%$%GYtf67fg34678hgfdyd"), "Failed for input: '&%&%/$%$%$%$%GYtf67fg34678hgfdyd'");
    }
}