package com.myorg.leetcode.hashing;

import java.util.ArrayList;
;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] num1, int[] nums2){
        Set<Integer> num1Set = new HashSet<>();

        if(num1==null || nums2== null || num1.length ==0 || nums2.length==0 ){
            return new int[]{};
        }

        for(int num: num1){
            num1Set.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for(int num: nums2){
           if(num1Set.contains(num)){
                intersection.add(num);
           }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}
