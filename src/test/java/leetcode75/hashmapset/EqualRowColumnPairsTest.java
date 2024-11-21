package leetcode75.hashmapset;

import static leetcode75.hashmapset.EqualRowColumnPairs.equalPairs;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EqualRowColumnPairsTest {

    @Test
    void testExample1() {
        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int expected = 1;
        int actual = equalPairs(grid);
        assertEquals(expected, actual, "Test Example 1 Failed");
    }

    @Test
    void testExample2() {
        int[][] grid = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        int expected = 3;
        int actual = equalPairs(grid);
        assertEquals(expected, actual, "Test Example 2 Failed");
    }

    // Additional Test Cases (Optional)

    @Test
    void testNoEqualPairs() {
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        int expected = 0;
        int actual = equalPairs(grid);
        assertEquals(expected, actual, "Test No Equal Pairs Failed");
    }

    @Test
    void testAllEqualPairs() {
        int[][] grid = {
                {5, 5},
                {5, 5}
        };
        int expected = 4; // Each row matches each column
        int actual = equalPairs(grid);
        assertEquals(expected, actual, "Test All Equal Pairs Failed");
    }

    @Test
    void testSingleElement() {
        int[][] grid = {
                {42}
        };
        int expected = 1;
        int actual = equalPairs(grid);
        assertEquals(expected, actual, "Test Single Element Failed");
    }
}
