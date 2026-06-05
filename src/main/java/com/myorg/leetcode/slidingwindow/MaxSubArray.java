package com.myorg.leetcode.slidingwindow;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MaxSubArray {

    /**
     * the maxSubArray() is the optimized version, the maxSubArrayFirstPass was the first solution after creating tests
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums){
        if(nums == null){
            throw new RuntimeException("Input array is empty");
        }

        int maxSum= nums[0];
        int currentSum = nums[0];

        for(int i=1; i< nums.length; i++){
            currentSum = Math.max(nums[i], currentSum +nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return  maxSum;
    }



    public int maxSubArrayFirstPass(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for (int i = 0; i < nums.length; i++) {
           currentSum += nums[i];

            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
            return maxSum;
    }
}
