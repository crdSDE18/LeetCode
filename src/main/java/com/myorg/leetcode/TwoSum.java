package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
@RequiredArgsConstructor
public class TwoSum {
    /**
     *  Find the indices that sums the of the target value-the naive solution is O(n^2), but can be
     *  optimized using hashmap(average ( O(1) average lookup and reducing overall time complexity to O(n)
     * @param nums
     * @param target
     * @return array of indices of two summation of two-sum values
     */
    public int[] getTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (!numMapper.containsKey(difference)) {
                numMapper.put(nums[i],i);
            } else {
                return new int[]{numMapper.get(difference), i};
            }
        }
        return new int[]{0, 0};
    }
}
