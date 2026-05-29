package com.myorg.leetcode.twopointers;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValidPalindrome {


    public boolean isPalindrome(String input){
    if (input == null){return false;}
    if (input.equals("")) {return  true;}

    int lp=0, rp = input.length() -1;
     while(lp < rp){

         while(lp <rp && !Character.isLetterOrDigit(input.charAt(lp))){
             lp++;
         }

         while(lp <rp && !Character.isLetterOrDigit(input.charAt(rp))){
             rp--;
         }

         if(Character.toLowerCase(input.charAt(lp)) != Character.toLowerCase(input.charAt(rp))){
             return false;
         }
         lp++;
         rp--;
     }
     return true;
    }


    /**
     * Brute force solution that uses extra memory creating a new String in memory, still O(n)
     * @param input
     * @return
     */

    public boolean isPalindromeBruteFore(String input){
        if (input == null){return false;}
        if (input.equals("")) {return  true;}

        String formattedString = formatString(input);
        int lp=0, rp= formattedString.length() -1;
        while(lp < rp){
            if(formattedString.charAt(lp)!= formattedString.charAt(rp)){
                return false;
            }
                lp++;
                rp--;
        }
       return true;
    }

    private String formatString(String input){
        StringBuilder formatString = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                formatString.append(ch);
            }
        }
        return formatString.toString().toLowerCase();
    }

}
