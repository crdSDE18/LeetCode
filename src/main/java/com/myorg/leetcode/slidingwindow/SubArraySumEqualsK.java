package com.myorg.leetcode.slidingwindow;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
public class SubArraySumEqualsK {

    /**
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        //import this allows base case for currentSum - k = 0 is found;
        prefixSumMap.put(0, 1);

        int sum = 0;
        int subarrayCount = 0;
        for (int num : nums) {
           sum +=num;
            if (prefixSumMap.containsKey(sum - k)) {
                subarrayCount += prefixSumMap.get(sum-k);
            }
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }
        return subarrayCount;
    }
}
