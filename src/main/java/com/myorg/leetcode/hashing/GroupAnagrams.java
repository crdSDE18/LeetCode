package com.myorg.leetcode.hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        if(strs == null){throw new RuntimeException("String array cannot be empty");}

        for (String s : strs) {
            char[] stringArray = s.toCharArray();
            Arrays.sort(stringArray);

            anagrams.computeIfAbsent(String.valueOf(stringArray), str -> new ArrayList<>()).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        result.addAll(anagrams.values());

        return result;

    }




}
