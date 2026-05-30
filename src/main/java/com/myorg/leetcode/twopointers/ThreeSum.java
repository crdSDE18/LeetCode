package com.myorg.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /**
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> threeSumResults = new ArrayList<>();
        if(nums.length <3){
            return threeSumResults;
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lp = i + 1;
            int rp = nums.length -1;
            while (lp < rp) {
                int currentSum = nums[i] + nums[lp] + nums[rp];
                if (currentSum == 0) {
                    List<Integer> result = Arrays.asList(nums[i], nums[lp], nums[rp]);
                    threeSumResults.add(result);

                    int lv = nums[lp];
                    int rv = nums[rp];

                    while (lp < rp && nums[lp] == lv) {lp++;}
                    while (lp < rp && nums[rp] == rv) {rp--;}
                }
                else if (currentSum < 0) {
                    lp++;
                } else {
                    rp--;
                }
            }
        }
        return threeSumResults;
    }
}
