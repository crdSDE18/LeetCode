package com.myorg.leetcode.twopointers;

public class TwoSumSorted {

    /**
     *  The solution's time complexity is average O(n), because the array is sorted, i used the 2 method approach. I start from the front and pointer at the
     *  end, and i move pointer based on value of current sum and target.
     * @param numbers
     * @param target
     * @return
     */

    public int[] twoSumSorted(int[] numbers, int target){
        int lp=0, rp= numbers.length - 1;

        while(lp <rp){
            int currentSum = numbers[lp] + numbers[rp];
            if(currentSum == target){
                return new int[]{lp+1,rp+1};
            } else if (currentSum < target) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return new int[]{0,0};
    }

}
