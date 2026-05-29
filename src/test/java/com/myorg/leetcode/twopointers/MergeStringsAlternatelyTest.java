package com.myorg.leetcode.twopointers;

import com.myorg.leetcode.twopointers.MergeStringsAlternatively;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {


    private MergeStringsAlternatively mergeStringsAlternatively;

    @BeforeEach
    void setUp(){
        mergeStringsAlternatively = new MergeStringsAlternatively();
    }

    @Test
    void mergeStringsEqualLength(){
        String w1 = "win"; String w2= "fun";
        String expected = "wfiunn";
        String actual = mergeStringsAlternatively.mergeAlternately(w1,w2);

        assertEquals(expected,actual);

    }

    @Test
    void mergeStringsW1Longer(){
        String w1 = "wins"; String w2= "fun";
        String expected = "wfiunns";
        String actual = mergeStringsAlternatively.mergeAlternately(w1,w2);

        assertEquals(expected,actual);

    }

    @Test
    void mergeStringsW2Longer(){
        String w1 = "wi"; String w2= "fison";
        String expected = "wfiison";
        String actual = mergeStringsAlternatively.mergeAlternately(w1,w2);

        assertEquals(expected,actual);

    }


}
