package com.myorg.leetcode.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysTest {

    private final IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

    @Test
    void shouldReturnIntersectionForBasicCase() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] expected = {2};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldReturnEmptyArrayWhenNoIntersectionExists() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        int[] expected = {};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldReturnAllElementsWhenArraysAreIdentical() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};

        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleOneEmptyArray() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};

        int[] expected = {};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleBothEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};

        int[] expected = {};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleSingleElementIntersection() {
        int[] nums1 = {5};
        int[] nums2 = {5};

        int[] expected = {5};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleSingleElementNoIntersection() {
        int[] nums1 = {5};
        int[] nums2 = {7};

        int[] expected = {};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] nums1 = {-1, -2, -3};
        int[] nums2 = {-2, -4};

        int[] expected = {-2};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleDuplicateValuesCorrectly() {
        int[] nums1 = {1, 1, 1, 2, 2};
        int[] nums2 = {1, 2};

        int[] expected = {1, 2};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleUnsortedArrays() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] expected = {4, 9};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleArraysContainingZero() {
        int[] nums1 = {0, 1, 2};
        int[] nums2 = {0, 3, 4};

        int[] expected = {0};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldHandleLargeDuplicateCounts() {
        int[] nums1 = {2, 2, 2, 2, 2};
        int[] nums2 = {2, 2, 2};

        int[] expected = {2};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }

    @Test
    void shouldReturnSubsetWhenOneArrayContainsAllElementsOfTheOther() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 4};

        int[] expected = {2, 4};

        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }
}

