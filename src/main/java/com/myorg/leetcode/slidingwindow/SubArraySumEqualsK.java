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

        int currentSum = 0;
        int totalSubArraySum = 0;
        int timesSumSeenBefore = 0;
        for (int num : nums) {
            currentSum +=num;
            if (prefixSumMap.containsKey(currentSum - k)) {
                timesSumSeenBefore = prefixSumMap.get(currentSum-k);
                totalSubArraySum += timesSumSeenBefore;
            }
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        return totalSubArraySum;
    }
}
