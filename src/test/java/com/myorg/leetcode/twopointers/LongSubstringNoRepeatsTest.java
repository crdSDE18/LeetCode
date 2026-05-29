package com.myorg.leetcode.twopointers;

import com.myorg.leetcode.twopointers.LongestSubStringNoRepeats;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongSubstringNoRepeatsTest {

    private LongestSubStringNoRepeats longestSubStringNoRepeats;

    @BeforeEach
        void setUp(){
        longestSubStringNoRepeats = new LongestSubStringNoRepeats();
    }

    @Test
    void testLongestStringNoRepeats_one(){
        String input = "abcabcbb";
        int expectedOutput = 3;

        int output = longestSubStringNoRepeats.lengthOfLongestSubString(input);
        assertEquals(expectedOutput,output);

    }

    @Test
    void testLongestStringNoRepeats_two(){
        String input = "bbbbbb";
        int expectedOutput = 1;

        int output = longestSubStringNoRepeats.lengthOfLongestSubString(input);
        assertEquals(expectedOutput,output);

    }

    @Test
    void testLongestStringNoRepeats_three(){
        String input = "pwwkew";
        int expectedOutput = 3;

        int output = longestSubStringNoRepeats.lengthOfLongestSubString(input);
        assertEquals(expectedOutput,output);

    }
}
