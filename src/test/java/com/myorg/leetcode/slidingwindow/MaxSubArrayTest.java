package com.myorg.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSubArrayTest {

    private MaxSubArray solution;

    @BeforeEach
    void setUp(){
        solution = new MaxSubArray();
    }

    @Test
    void testSinglePositiveElement() {
        assertEquals(5,
                solution.maxSubArray(new int[]{5}));
    }

    @Test
    void testSingleNegativeElement() {
        assertEquals(-5,
                solution.maxSubArray(new int[]{-5}));
    }


    @Test
    void testAllPositiveNumbers() {
        assertEquals(15,
                solution.maxSubArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testAllNegativeNumbers() {
        assertEquals(-1,
                solution.maxSubArray(new int[]{-4, -2, -7, -1, -9}));
    }

    @Test
    void testMixedNumbers() {
        assertEquals(10,
                solution.maxSubArray(new int[]{2, -1, 2, 3, 4, -5}));
    }

    @Test
    void testZerosOnly() {
        assertEquals(0,
                solution.maxSubArray(new int[]{0, 0, 0, 0}));
    }

    @Test
    void testNegativeAndZero() {
        assertEquals(0,
                solution.maxSubArray(new int[]{-1, 0, -2, -3}));
    }

    @Test
    void testMaximumAtBeginning() {
        assertEquals(10,
                solution.maxSubArray(new int[]{10, -3, -4, -5}));
    }

    @Test
    void testMaximumAtEnd() {
        assertEquals(10,
                solution.maxSubArray(new int[]{-5, -4, -1, 10}));
    }

    @Test
    void testLargeNegativeBetweenPositives() {
        assertEquals(8,
                solution.maxSubArray(new int[]{5, -100, 3, 5}));
    }

    @Test
    void testLeetCodeCase() {
        assertEquals(23,
                solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }


}
