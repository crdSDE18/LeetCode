package com.myorg.leetcode.hashing;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();


    private static List<List<String>> normalize(List<List<String>> groups) {
        if (groups == null) return null;
        List<List<String>> sortedGroups = new ArrayList<>();
        for (List<String> g : groups) {
            List<String> copy = new ArrayList<>(g);
            Collections.sort(copy);
            sortedGroups.add(copy);
        }
        sortedGroups.sort(Comparator.comparing(a -> String.join(",", a)));
        return sortedGroups;
    }

    @Test
    void exampleTest() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("ate","eat","tea"),
                Arrays.asList("nat","tan"),
                Collections.singletonList("bat")
        );

        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void emptyArray() {
        String[] input = {};
        List<List<String>> actual = solution.groupAnagrams(input);
        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    void singleElement() {
        String[] input = {"abc"};
        List<List<String>> expected = Collections.singletonList(Collections.singletonList("abc"));
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void allAnagrams() {
        String[] input = {"abc","bca","cab","cba"};
        List<List<String>> expected = Collections.singletonList(Arrays.asList("abc","bca","cab","cba"));
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void noAnagrams() {
        String[] input = {"a","b","c"};
        List<List<String>> expected = Arrays.asList(
                Collections.singletonList("a"),
                Collections.singletonList("b"),
                Collections.singletonList("c")
        );
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void emptyStringsAndDuplicates() {
        String[] input = {"", "", "b"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("", ""),
                Collections.singletonList("b")
        );
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void caseSensitivity() {
        String[] input = {"a", "A", "aA", "Aa"};
        List<List<String>> expected = Arrays.asList(
                Collections.singletonList("A"),
                Collections.singletonList("a"),
                Arrays.asList("Aa", "aA")
        );
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

    @Test
    void longStrings() {
        String longA = "a".repeat(1000);
        String longB = "b".repeat(1000);
        String[] input = {longA, longA, longB};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList(longA, longA),
                Collections.singletonList(longB)
        );
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(normalize(expected), normalize(actual));
    }

}
