package com.myorg.leetcode.twopointers;

public class MergeSortedArray {

    /**
     * two pointer solution with a twist extra pointer to keep track of current position in nums1
     * the goal is to write from the back as there are empty slots, then compare the values of lastValidNums1 vs lastValidNums2
     * <p>
     * Time: O(n)
     * Space O(1) using nums[1]
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastValidNums1 = m - 1;
        int lastValidNums2 = n - 1;
        int currentPosition = m + n - 1;

        while (lastValidNums1 >= 0 && lastValidNums2 >= 0) {
            if (nums1[lastValidNums1] >= nums2[lastValidNums2]) {
                nums1[currentPosition] = nums1[lastValidNums1];
                lastValidNums1--;
            } else {
                nums1[currentPosition] = nums2[lastValidNums2];
                lastValidNums2--;
            }
            currentPosition--;
        }

        while(lastValidNums2 >=0){
            nums1[currentPosition] = nums2[lastValidNums2];
            lastValidNums2--;
            currentPosition--;
        }
    }
}

