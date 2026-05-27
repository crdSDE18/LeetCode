package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RemoveDupsSortedList {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return nums.length;
        }
        int lp = 1, rp = 1;
        while (rp < nums.length) {
            if (nums[rp] != nums[rp-1]) {
                nums[rp] = nums[lp];
                rp++;
            } else {
                lp++;
            }
        }
            return rp;
    }
}
