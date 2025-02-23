package leetcode75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfProvincesTest {

  private NumberOfProvinces solution;

  @BeforeEach
  void setUp() {
    solution = new NumberOfProvinces();
  }

  @Test
  void testExample1() {
    // Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
    int[][] isConnected = {
      {1, 1, 0},
      {1, 1, 0},
      {0, 0, 1}
    };

    int expected = 2;
    int actual = solution.findCircleNum(isConnected);

    assertEquals(expected, actual, "Should return 2 provinces for the given connection matrix");
  }

  @Test
  void testExample2() {
    // Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
    int[][] isConnected = {
      {1, 0, 0},
      {0, 1, 0},
      {0, 0, 1}
    };

    int expected = 3;
    int actual = solution.findCircleNum(isConnected);

    assertEquals(expected, actual, "Should return 3 provinces for the given connection matrix");
  }
}
