package com.myorg.leetcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
public class TwoSumTest{

    private  TwoSum twoSumMock;

    @BeforeEach
    void setUp(){
        twoSumMock = new TwoSum();
    }

    @Test
    void testTwoSum_one(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,1};
        int[] answer = twoSumMock.getTwoSum(arr,9);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_two(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,3};
        int[] answer = twoSumMock.getTwoSum(arr,17);
        assertArrayEquals(expectedOutput,answer);
    }

    @Test
    void testTwoSum_three(){
        int[] arr= {2,7,11,15};
        int[] expectedOutput = {0,0};
        int[] answer = twoSumMock.getTwoSum(arr,20);
        assertArrayEquals(expectedOutput,answer);
    }


}
