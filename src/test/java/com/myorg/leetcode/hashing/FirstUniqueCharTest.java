package com.myorg.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharTest {

    private final FirstUniqueCharacter solution = new FirstUniqueCharacter();

    @Test
    void returnsIndexForSingleUniqueCharacter() {
        assertEquals(0, solution.firstUniqueChar("a"));
        assertEquals(0, solution.firstUniqueChar("abc"));
    }

    @Test
    void returnsIndexWhenUniqueAtEnd() {
        assertEquals(4, solution.firstUniqueChar("aabbc"));
        assertEquals(4, solution.firstUniqueChar("aabbcd"));
    }

    @Test
    void returnsIndexWhenUniqueAtBeginning() {
        assertEquals(0, solution.firstUniqueChar("abbb"));
        assertEquals(0, solution.firstUniqueChar("zxxxx"));
    }

    @Test
    void returnsMinusOneWhenNoUniqueCharacter() {
        assertEquals(-1, solution.firstUniqueChar("abab"));
        assertEquals(-1, solution.firstUniqueChar("aabbcc"));
        assertEquals(-1, solution.firstUniqueChar("zzxxzz"));
    }

    @Test
    void handlesEmptyAndNullInput() {
        assertEquals(-1, solution.firstUniqueChar(""));
        assertEquals(-1, solution.firstUniqueChar(null));
    }

    @Test
    void handlesMixedCaseCharacters() {
        // assuming case-sensitive behavior
        assertEquals(0, solution.firstUniqueChar("Aa"));
        assertEquals(1, solution.firstUniqueChar("aAab"));
    }
}
