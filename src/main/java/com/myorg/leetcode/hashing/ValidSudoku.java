package com.myorg.leetcode.hashing;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class ValidSudoku {
    /**
     * This problem has 3 rule:
     * 1. ensure no duplicates in row
     * 2. ensure no duplicates in columns
     * 3. ensure no duplicates in grid - submatrix 3*3 contains no duplicates.
     * Current solution uses 3 maps of set of integers to house each solution - could be optimized to use List<Set>
     * @param board
     * @return
     */

    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return false;
        }
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> grid = new HashMap<>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                char currentChar =  board[r][c];
                if(currentChar == '.'){
                    continue;
                }
                int number = Character.getNumericValue(currentChar);
                if (number < 1 || (number > 9)) {
                    return false;
                }
                //row validation
                Set<Character> rowSet = rows.computeIfAbsent(r, k -> new HashSet<>());
                if (!rowSet.add(currentChar)) {
                    return false;
                }
                //column validation
                Set<Character> colSet = cols.computeIfAbsent(c, k -> new HashSet<>());
                if (!colSet.add(currentChar)) {
                    return false;
                }
                //grid validation
                int key  = (r/3) *3 + (c/3);
                Set<Character> gridSet = grid.computeIfAbsent(key, k -> new HashSet<>());
                if (!gridSet.add(currentChar)) {
                    return false;
                }

            }
        }
        return true;
    }

}
