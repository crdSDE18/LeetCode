package com.myorg.leetcode.twopointers;

import com.myorg.leetcode.twopointers.ContainerWithMostWater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * generated test class
 */
public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void emptyOrSingle_returnsZero() {
        assertEquals(0, containerWithMostWater.maxArea(new int[]{}));
        assertEquals(0, containerWithMostWater.maxArea(new int[]{5}));
    }

    @Test
    void simpleExample() {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, containerWithMostWater.maxArea(h));
    }

    @Test
    void twoElements() {
        assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
        assertEquals(2, containerWithMostWater.maxArea(new int[]{2, 4}));
    }

    @Test
    void monotonicIncreasing() {
        int[] h = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(20, containerWithMostWater.maxArea(h));
    }

    @Test
    void monotonicDecreasing() {
        int[] h = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(20, containerWithMostWater.maxArea(h));
    }

    @Test
    void equalHeights() {
        int[] h = {5, 5, 5, 5, 5};
        assertEquals(20, containerWithMostWater.maxArea(h));
    }

    @Test
    void zerosAndPositives() {
        int[] h = {0, 0, 2, 0, 3, 0, 0, 4, 0};
        assertEquals(10, containerWithMostWater.maxArea(h));
    }

    @Test
    void alternatingHighLow() {
        int[] h = {1, 100, 1, 100, 1, 100, 1};
        assertEquals(400, containerWithMostWater.maxArea(h));
    }

    @Test
    void largePlateauWithEdgeMax() {
        int[] h = {1, 100, 100, 100, 1};
        assertEquals(200, containerWithMostWater.maxArea(h));
    }
}