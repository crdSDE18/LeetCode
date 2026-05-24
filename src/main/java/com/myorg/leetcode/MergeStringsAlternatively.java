package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MergeStringsAlternatively {
    /**
     * This is just a refresher task to get prepared for harder ones, simple task to create a string from 2 different strings.
     * @param w1
     * @param w2
     * @return single string of combined strings
     */
    public String mergeAlternately(String w1, String w2){
        StringBuilder finalString = new StringBuilder(w1.length() + w2.length());
        if(w1 ==null){w1= "";}
        if(w2==null){w2="";}

        int lwp = 0;
        int rwp = 0;

        while(lwp < w1.length() && rwp < w2.length()){
            finalString.append(w1.charAt(lwp));
            finalString.append(w2.charAt(rwp));
            lwp++;
            rwp++;
        }
        while(lwp < w1.length()){
            finalString.append(w1.charAt(lwp));
            lwp++;
        }
        while(rwp < w2.length()){
            finalString.append(w2.charAt(rwp));
            rwp++;
        }
        return finalString.toString();
    }
}
