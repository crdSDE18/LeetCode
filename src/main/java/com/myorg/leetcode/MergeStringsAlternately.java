package com.myorg.leetcode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MergeStringsAlternately {

    public String mergeAlternately(String w1, String w2){
        StringBuilder finalString = new StringBuilder(w1.length() + w2.length());
        int lwp = 0;
        int rwp = 0;

        while(lwp == rwp && lwp < w1.length() && rwp < w2.length()){
            finalString.append(w1.charAt(lwp));
            finalString.append(w2.charAt(rwp));
            lwp++;
            rwp++;
        }
        while(w1.length() >w2.length() && lwp < w1.length()){
            finalString.append(w1.charAt(lwp));
            lwp++;
        }
        while(w2.length() >w1.length() && rwp < w2.length()){
            finalString.append(w2.charAt(rwp));
            rwp++;
        }
        return finalString.toString();
    }
}
