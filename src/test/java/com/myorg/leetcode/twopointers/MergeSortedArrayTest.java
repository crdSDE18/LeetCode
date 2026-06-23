package com.myorg.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MergeSortedArrayTest {

    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    void shouldMergeTypicalCase() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void shouldHandleEmptyNums2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void shouldHandleEmptyNums1Elements() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void shouldHandleDuplicates() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 2, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 2, 2, 2, 3}, nums1);
    }

    @Test
    void shouldHandleAllElementsFromNums2Smaller() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] nums1 = {-3, -1, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-2, 0, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{-3, -2, -1, 0, 2, 3}, nums1);
    }


}

