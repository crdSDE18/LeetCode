package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ContainerWithMostWater {

    /**
     * O(n) solution, the goal is to find the largest area across elements in the an array.
     * @param height - array of heights to calculate area from
     * @return maxArea
     */
    public int maxArea(int[] height){
        int maxArea = 0;
        int l=0,r=height.length -1;
        while(l < r){
            int currentMaxArea= Math.min(height[l],height[r]) * (r -l);
            maxArea= Math.max(currentMaxArea,maxArea);
            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return maxArea;
    }
}
