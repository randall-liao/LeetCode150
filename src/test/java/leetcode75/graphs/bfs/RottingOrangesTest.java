package leetcode75.graphs.bfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RottingOrangesTest {

  RottingOranges solution;

  @BeforeEach
  void setUp() {
    this.solution = new RottingOranges();
  }

  @Test
  void exampleOne() {
    int[][] grid = {
      {2, 1, 1},
      {1, 1, 0},
      {0, 1, 1}
    };
    int expected = 4;
    int actual = this.solution.orangesRotting(grid);
    assertEquals(expected, actual);
  }

  @Test
  void emptyGrid() {
    int[][] grid = {{0}};
    int expected = 0;
    int actual = this.solution.orangesRotting(grid);
    assertEquals(expected, actual);
  }

  @Test
  void oneFreshGrid() {
    int[][] grid = {{1}};
    int expected = -1;
    int actual = this.solution.orangesRotting(grid);
    assertEquals(expected, actual);
  }
}
