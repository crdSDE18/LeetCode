package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumSortedTest {

    private TwoSumSorted solution;
    private int[] arr;

    @BeforeEach
    void setUp() {
        solution = new TwoSumSorted();
        arr = new int[]{1, 2, 3, 4, 6};
    }

    @Test
    void testBasicCase() {
        int[] input = new int[]{2, 7, 11, 15};
        assertArrayEquals(new int[]{1, 2}, solution.twoSumSorted(input, 9));
    }

    @Test
    void testMiddlePair() {
        int[] input = new int[]{1, 2, 3, 4, 6};
        assertArrayEquals(new int[]{2, 4}, solution.twoSumSorted(input, 6));
    }

    @Test
    void testAdjacentElements() {
        int[] input = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2}, solution.twoSumSorted(input, 3));
    }

    @Test
    void testNegativeNumbers() {
        int[] input = new int[]{-4, -1, 0, 2, 5};
        assertArrayEquals(new int[]{1, 5}, solution.twoSumSorted(input, 1));
    }

    @Test
    void testDuplicates() {
        int[] input = new int[]{1, 1, 2, 3};
        assertArrayEquals(new int[]{1, 2}, solution.twoSumSorted(input, 2));
    }

    @Test
    void testEdgeElements() {
        int[] input = new int[]{1, 2, 3, 4, 6};
        assertArrayEquals(new int[]{1, 5}, solution.twoSumSorted(input, 7));
    }

    @Test
    void testMinimumSize() {
        int[] input = new int[]{1, 2};
        assertArrayEquals(new int[]{1, 2}, solution.twoSumSorted(input, 3));
    }

    @Test
    void testLargeNumbers() {
        int[] input = new int[]{1000000, 2000000, 3000000};
        assertArrayEquals(new int[]{2, 3}, solution.twoSumSorted(input, 5000000));
    }
}