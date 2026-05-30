package com.myorg.leetcode.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    private ThreeSum solution;

    @BeforeEach
    void setUp(){
        solution = new ThreeSum();
    }

    @Test
    void shouldFindTwoTriplets() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldReturnEmptyWhenNoTripletsExist() {
        int[] nums = {1, 2, 3, 4};

        List<List<Integer>> expected = List.of();

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldHandleAllZeros() {
        int[] nums = {0, 0, 0, 0};

        List<List<Integer>> expected = List.of(
                List.of(0, 0, 0)
        );

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldReturnEmptyForEmptyArray() {
        int[] nums = {};

        List<List<Integer>> expected = List.of();

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldReturnEmptyForSingleElement() {
        int[] nums = {1};

        List<List<Integer>> expected = List.of();

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldReturnEmptyForTwoElements() {
        int[] nums = {-1, 1};

        List<List<Integer>> expected = List.of();

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldHandleDuplicateValuesCorrectly() {
        int[] nums = {-2, 0, 0, 2, 2};

        List<List<Integer>> expected = List.of(
                List.of(-2, 0, 2)
        );

        assertEquals(expected, solution.threeSum(nums));
    }

    @Test
    void shouldFindSingleValidTriplet() {
        int[] nums = {-2, 0, 1, 1, 2};

        List<List<Integer>> expected = List.of(
                List.of(-2, 0, 2),
                List.of(-2, 1, 1)
        );

        assertEquals(expected, solution.threeSum(nums));
    }
}
