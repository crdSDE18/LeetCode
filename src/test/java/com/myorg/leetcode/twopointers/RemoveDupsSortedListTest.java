package com.myorg.leetcode.twopointers;

import com.myorg.leetcode.twopointers.RemoveDupsSortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDupsSortedListTest {

    private RemoveDupsSortedList removeDupsSortedList;

    @BeforeEach
    void setUp(){
        removeDupsSortedList = new RemoveDupsSortedList();
    }

    @Test
    public void testBasicCase() {
        int[] nums = {1, 1, 3};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(2, expectedOutput);
    }

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(4, expectedOutput);
    }

    @Test
    public void testAllDuplicates() {
        int[] nums = {2, 2, 2, 2};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(1, expectedOutput);
    }

    @Test
    public void testMixedDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(5, expectedOutput);
    }

    @Test
    public void testSingleElement() {
        int[] nums = {7};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(1, expectedOutput);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int expectedOutput = removeDupsSortedList.removeDuplicates(nums);
        assertEquals(0, expectedOutput);
    }
}
