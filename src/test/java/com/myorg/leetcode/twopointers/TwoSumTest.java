package com.myorg.leetcode.twopointers;
import com.myorg.leetcode.twopointers.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TwoSumTest{

    private TwoSum twoSumMock;

    @BeforeEach
    void setUp(){
        twoSumMock = new TwoSum();
    }

    @Test
    void testTwoSum_BaseCase(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,1};
        int[] answer = twoSumMock.getTwoSum(arr,9);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_SwitchingIndex(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,3};
        int[] answer = twoSumMock.getTwoSum(arr,17);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_TargetNotFound(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,0};
        int[] answer = twoSumMock.getTwoSum(arr,20);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_EmptyArray(){
        int[] arr= {};
        int[] expectedOutput = {0,0};
        int[] answer = twoSumMock.getTwoSum(arr,20);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_ArraySizeOne(){
        int[] arr= {2};
        int[] expectedOutput = {0,0};
        int[] answer = twoSumMock.getTwoSum(arr,5);
        assertArrayEquals(expectedOutput,answer);
    }

}
