package com.myorg.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSubarrayLenTest {

    private final MinSubarrayLen solution = new MinSubarrayLen();

    @Test
    void shouldReturnTwoForTypicalCase() {
        assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void shouldReturnOneWhenSingleElementMeetsTarget() {
        assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 4, 4}));
    }

    @Test
    void shouldReturnZeroWhenNoValidSubarrayExists() {
        assertEquals(0, solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void shouldHandleSingleElementArrayMeetingTarget() {
        assertEquals(1, solution.minSubArrayLen(5, new int[]{5}));
    }

    @Test
    void shouldHandleSingleElementArrayNotMeetingTarget() {
        assertEquals(0, solution.minSubArrayLen(5, new int[]{4}));
    }

    @Test
    void shouldReturnEntireArrayLengthWhenRequired() {
        assertEquals(5, solution.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void shouldFindShortestWindowNearEnd() {
        assertEquals(3, solution.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void shouldHandleRepeatedValues() {
        assertEquals(3, solution.minSubArrayLen(6, new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    void shouldHandleLargeTargetReachedLate() {
        assertEquals(2, solution.minSubArrayLen(15, new int[]{1, 2, 3, 4, 8, 7}));
    }

    @Test
    void shouldReturnOneForExactMatchAtEnd() {
        assertEquals(1, solution.minSubArrayLen(10, new int[]{1, 2, 3, 10}));
    }

}
