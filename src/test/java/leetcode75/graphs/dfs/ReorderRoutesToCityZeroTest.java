package leetcode75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReorderRoutesToCityZeroTest {

  ReorderRoutesToCityZero solution;

  @BeforeEach
  void setUp() {
    this.solution = new ReorderRoutesToCityZero();
  }

  @Test
  void minReorder_exampleOne() {
    int numbersOfCity = 6;
    int[][] connections = {
      {0, 1},
      {1, 3},
      {2, 3},
      {4, 0},
      {4, 5}
    };
    int expected = 3;
    int actual = solution.minReorder(numbersOfCity, connections);
    assertEquals(expected, actual);
  }
}
