package com.myorg.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraySumEqualsKTest {

    private  SubArraySumEqualsK solution;

    @BeforeEach
    void setUp(){
        solution = new SubArraySumEqualsK();
    }

    @Test
    void example1() {
        assertEquals(2,
                solution.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    void example2() {
        assertEquals(2,
                solution.subarraySum(new int[]{1, 2, 3}, 3));
    }

    @Test
    void singleElementEqualsK() {
        assertEquals(1,
                solution.subarraySum(new int[]{5}, 5));
    }

    @Test
    void singleElementNotEqualsK() {
        assertEquals(0,
                solution.subarraySum(new int[]{5}, 3));
    }

    @Test
    void containsNegativeNumbers() {
        assertEquals(3,
                solution.subarraySum(new int[]{1, -1, 0}, 0));
    }

    @Test
    void allZeros() {
        assertEquals(6,
                solution.subarraySum(new int[]{0, 0, 0}, 0));
    }

    @Test
    void negativeAndPositiveValues() {
        assertEquals(4,
                solution.subarraySum(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7));
    }

    @Test
    void noMatchingSubarray() {
        assertEquals(0,
                solution.subarraySum(new int[]{1, 2, 3}, 10));
    }

    @Test
    void emptyArray() {
        assertEquals(0,
                solution.subarraySum(new int[]{}, 0));
    }

    @Test
    void multipleOverlappingSubarrays() {
        assertEquals(3,
                solution.subarraySum(new int[]{1, 1, 1, 1}, 2));
    }

    @Test
    void allNegativeNumbers() {
        assertEquals(3,
                solution.subarraySum(new int[]{-1, -1, 1}, -1));
    }

    @Test
    void largeRepeatedNumbers() {
        assertEquals(3,
                solution.subarraySum(new int[]{2, 2, 2, 2}, 4));
    }


}
