package com.myorg.leetcode.twopointers;

import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class LongestSubStringNoRepeats {
    /**
     * Time complexity O(n) as the for loop iterates over the entire length of s, but the while loop just continues/corrects the window not adding any complexity.
     * @param s
     * @return len of window/substring of unique characters
     */
    public int lengthOfLongestSubString(String s) {
        Set<Character> setOfCharsInWindow = new HashSet<>();
        int maxLen=0;
        int startingIndex = 0;
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        setOfCharsInWindow.add(s.charAt(startingIndex));
        for (int i = 1; i < s.length(); i++) {
            if (setOfCharsInWindow.contains(s.charAt(i))) {

                while (!setOfCharsInWindow.add(s.charAt(i))) {
                    setOfCharsInWindow.remove(s.charAt(startingIndex));
                    startingIndex++;
                }
            }
                setOfCharsInWindow.add(s.charAt(i));
                maxLen = Math.max(maxLen, i - startingIndex + 1);
        }
        return maxLen;
    }
}
