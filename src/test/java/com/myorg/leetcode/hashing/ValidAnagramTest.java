package com.myorg.leetcode.hashing;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ValidAnagramTest {

        private final ValidAnagram solution = new ValidAnagram();

        @Test
        void shouldReturnTrueForValidAnagram() {
            assertTrue(solution.isAnagram("anagram", "nagaram"));
        }

        @Test
        void shouldReturnFalseForInvalidAnagram() {
            assertFalse(solution.isAnagram("rat", "car"));
        }

        @Test
        void shouldReturnTrueForEmptyStrings() {
            assertTrue(solution.isAnagram("", ""));
        }

        @Test
        void shouldReturnFalseForDifferentLengths() {
            assertFalse(solution.isAnagram("abc", "ab"));
        }

        @Test
        void shouldReturnTrueForSingleCharacterMatch() {
            assertTrue(solution.isAnagram("a", "a"));
        }

        @Test
        void shouldReturnFalseForSingleCharacterMismatch() {
            assertFalse(solution.isAnagram("a", "b"));
        }

        @Test
        void shouldReturnTrueForRepeatedCharacters() {
            assertTrue(solution.isAnagram("aabbcc", "ccbbaa"));
        }

        @Test
        void shouldReturnFalseWhenCharacterCountsDiffer() {
            assertFalse(solution.isAnagram("aabbcc", "aabbcd"));
        }

        @Test
        void shouldBeCaseSensitive() {
            assertFalse(solution.isAnagram("Listen", "Silent"));
        }

        @Test
        void shouldHandleUnicodeCharacters() {
            assertTrue(solution.isAnagram("éà", "àé"));
        }

        @Test
        void shouldReturnTrueForIdenticalStrings() {
            assertTrue(solution.isAnagram("hello", "hello"));
        }
    }

