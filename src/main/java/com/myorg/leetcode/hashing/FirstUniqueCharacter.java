package com.myorg.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {


    /**
     * the solution is using hashmap O(n) space, but O(1) average lookup,
     * add all characters to map and their occurrences, then iterate through the string in order to see the first
     * unique occurrence Integer==1, if not, return -1
     *
     * Time O(n), space O(m) where m is unique characters
     * @param s
     * @return
     */
    public int firstUniqueChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }

        for( int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))== 1) return i;
        }

        return -1;
    }
}

