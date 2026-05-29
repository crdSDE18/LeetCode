package com.myorg.leetcode.twopointers;

import lombok.RequiredArgsConstructor;

import java.util.HashSet;

@RequiredArgsConstructor
public class ContainsDuplicates {

    /**
     * simple method to see if an array contains duplicates, simple refresher task that runs in O(n) time and O(n) space because of set.
     * @param nums
     * @return true(if it's a duplicate), false if not
     */
    public boolean containsDup(int[] nums){
        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            if(!numSet.add(num)){
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}
