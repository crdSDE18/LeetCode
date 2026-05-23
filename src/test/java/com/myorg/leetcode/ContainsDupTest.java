package com.myorg.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDupTest {

    private ContainsDuplicates dupsMock;

    @BeforeEach
    void setUp(){
        dupsMock = new ContainsDuplicates();
    }

    @Test
    void testContainsUniqueNumber(){
        int[] arr = {1,2,4,5};
        boolean expected = false;
        boolean actual = dupsMock.containsDup(arr);

        assertEquals(expected,actual);
    }

    @Test
    void testContainsDups(){
        int[] arr = {1,2,4,1};
        boolean expected = true;
        boolean actual = dupsMock.containsDup(arr);

        assertEquals(expected,actual);
    }

    @Test
    void testArraySizeOne(){
        int[] arr = {1};
        boolean expected = false;
        boolean actual = dupsMock.containsDup(arr);

        assertEquals(expected,actual);
    }

    @Test
    void testEmptyArray(){
        int[] arr = {};
        boolean expected = false;
        boolean actual = dupsMock.containsDup(arr);

        assertEquals(expected,actual);
    }
}
