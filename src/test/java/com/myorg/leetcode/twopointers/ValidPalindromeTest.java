package com.myorg.leetcode.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {


    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp(){
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void shouldReturnTrueForSimplePalindrome()
    { assertTrue(validPalindrome.isPalindrome("racecar")); }

    @Test void shouldReturnFalseForNonPalindrome() {
        assertFalse(validPalindrome.isPalindrome("hello")); }

    @Test void shouldIgnoreCase() {
        assertTrue(validPalindrome.isPalindrome("RaceCar")); }

    @Test void shouldIgnoreSpecialCharactersAndSpaces() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")); }

    @Test void shouldReturnFalseForInvalidPalindromeWithSpecialCharacters() {
        assertFalse(validPalindrome.isPalindrome("race a car")); }

    @Test void shouldReturnTrueForEmptyString() {
        assertTrue(validPalindrome.isPalindrome("")); }

    @Test void shouldReturnTrueForSingleCharacter() {
        assertTrue(validPalindrome.isPalindrome("a")); }

    @Test void shouldReturnTrueForNumericPalindrome() {
        assertTrue(validPalindrome.isPalindrome("12321")); }

    @Test void shouldReturnFalseForNumericNonPalindrome() {
        assertFalse(validPalindrome.isPalindrome("12345")); }

    @Test void shouldReturnTrueForStringWithOnlySpecialCharacters() {
        assertTrue(validPalindrome.isPalindrome("!!!")); }
}
