package com.myorg.leetcode.slidingwindow;

public class MinSubarrayLen {

    /**
     * Sliding window problem to find the min length of the subArray that is >= target.
     * When the current window sum >= target,
     * then calculate the length of that subArray then increment left for
     * any other subArrays >= sum;
     *
     * Integer.MAX_VALUE keeps track if the sum is not found in the subArray. If at the end of my for loop minLen ==
     * Integer.MAX_VALUE is never found.
     *
     * space complexity O(1)
     * Time complexity O(n)
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            while (currSum >= target) {
                minLen = Math.min(minLen, i - left + 1);
                currSum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}

