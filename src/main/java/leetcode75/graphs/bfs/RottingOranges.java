package leetcode75.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

  private static final int EMPTY = 0;

  private static final int FRESH = 1;

  private static final int ROTTEN = 2;

  private static final int NO_SOLUTION = -1;

  private int rowLength;

  private int columnLength;

  public int orangesRotting(int[][] grid) {
    Queue<Integer[]> rottenOrangePosition = new LinkedList<>();
    this.rowLength = grid.length;
    this.columnLength = grid[0].length;
    boolean[][] visited = new boolean[rowLength][columnLength];
    enqueueRottenOranges(grid, visited, rottenOrangePosition);
    int round = 0;
    while (!rottenOrangePosition.isEmpty()) {
      int currentLevelLength = rottenOrangePosition.size();
      round++;
      for (int i = 0; i < currentLevelLength; i++) {
        Integer[] position = rottenOrangePosition.poll();
        spoilNeighbors(position[0], position[1], grid, visited);
      }
      enqueueRottenOranges(grid, visited, rottenOrangePosition);
    }
    int rottenCount = 0;
    int emptyCount = 0;
    int freshCount = 0;
    int rotCount = 0;
    for (int row = 0; row < this.rowLength; row++) {
      for (int column = 0; column < this.columnLength; column++) {
        if (grid[row][column] == FRESH) {
          freshCount++;
        } else if (grid[row][column] == EMPTY) {
          emptyCount++;
        } else if (grid[row][column] == ROTTEN) {
          rotCount++;
        }
      }
    }
    if (freshCount > 0 && emptyCount != this.rowLength * this.columnLength) {
      return -1;
    }
    return round == 0 ? 0 : round - 1;
  }

  private void enqueueRottenOranges(
      int[][] grid, boolean[][] visited, Queue<Integer[]> rottenOrangePosition) {
    for (int row = 0; row < this.rowLength; row++) {
      for (int column = 0; column < this.columnLength; column++) {
        if (grid[row][column] == ROTTEN && !visited[row][column]) {
          rottenOrangePosition.add(new Integer[] {row, column});
          visited[row][column] = true;
        }
      }
    }
  }

  private void spoilNeighbors(int row, int column, int[][] grid, boolean[][] visited) {
    if (isInBound(row - 1, column) && !visited[row - 1][column] && grid[row - 1][column] == FRESH) {
      grid[row - 1][column] = ROTTEN;
    }
    if (isInBound(row + 1, column) && !visited[row + 1][column] && grid[row + 1][column] == FRESH) {
      grid[row + 1][column] = ROTTEN;
    }
    if (isInBound(row, column - 1) && !visited[row][column - 1] && grid[row][column - 1] == FRESH) {
      grid[row][column - 1] = ROTTEN;
    }
    if (isInBound(row, column + 1) && !visited[row][column + 1] && grid[row][column + 1] == FRESH) {
      grid[row][column + 1] = ROTTEN;
    }
  }

  private boolean isInBound(int row, int column) {
    return row >= 0 && column >= 0 && row < this.rowLength && column < this.columnLength;
  }
}
