package com.myorg.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /**
     * this was my first solution, there is an optimal solution using int[26] because of the constraints
     * My solution has overhead and autoboxing with the wrapper class
     * @param s
     * @param t
     * @return
     */

    public boolean isAnagram(String s, String t){
        if(s==null || t ==null){
            throw new NullPointerException("string cannot be null");
        }

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> characterCount = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            characterCount.merge(s.charAt(i),1,Integer::sum);
        }
        for(int i = 0; i< t.length(); i++){
            characterCount.merge(t.charAt(i),-1,Integer::sum);
            if(characterCount.get(t.charAt(i))!= null && characterCount.get(t.charAt(i))==0){
                characterCount.remove(t.charAt(i));
            }

        }
        return characterCount.isEmpty();
    }
}
