package leetcode75.graphs.bfs;

import java.util.*;

public class NearestExitEntranceMaze {

  private static final int ROW = 0;
  private static final int COLUMN = 1;
  private static final char PATH = '.';

  private static List<int[]> getNeighborsToVisit(
      int row, int column, char[][] maze, boolean[][] visited) {
    List<int[]> neighbors = new ArrayList<>();
    // Check Up
    if (row - 1 >= 0 && maze[row - 1][column] == PATH && !visited[row - 1][column]) {
      neighbors.add(new int[] {row - 1, column});
    }
    // Check Down
    if (row + 1 < maze.length && maze[row + 1][column] == PATH && !visited[row + 1][column]) {
      neighbors.add(new int[] {row + 1, column});
    }
    // Check Left
    if (column - 1 >= 0 && maze[row][column - 1] == PATH && !visited[row][column - 1]) {
      neighbors.add(new int[] {row, column - 1});
    }
    // Check Right
    if (column + 1 < maze[0].length && maze[row][column + 1] == PATH && !visited[row][column + 1]) {
      neighbors.add(new int[] {row, column + 1});
    }
    return neighbors;
  }

  private static boolean isExit(int row, int column, char[][] maze, int[] entrance) {
    // The entrance cell is not considered an exit.
    if (row == entrance[ROW] && column == entrance[COLUMN]) {
      return false;
    }
    // An exit is any cell on the maze border.
    return row == 0 || column == 0 || row == maze.length - 1 || column == maze[0].length - 1;
  }

  public int nearestExit(char[][] maze, int[] entrance) {
    int m = maze.length;
    int n = maze[0].length;
    boolean[][] visited = new boolean[m][n];
    Queue<int[]> nodeQueue = new LinkedList<>();
    nodeQueue.offer(new int[] {entrance[ROW], entrance[COLUMN]});
    visited[entrance[ROW]][entrance[COLUMN]] = true;
    int step = 0;

    while (!nodeQueue.isEmpty()) {
      int currentQueueSize = nodeQueue.size();
      for (int i = 0; i < currentQueueSize; i++) {
        int[] node = nodeQueue.poll();
        int row = node[ROW], col = node[COLUMN];
        if (isExit(row, col, maze, entrance)) {
          return step;
        }
        for (int[] neighbor : getNeighborsToVisit(row, col, maze, visited)) {
          int newRow = neighbor[0], newCol = neighbor[1];
          // Mark neighbor as visited immediately when enqueued
          visited[newRow][newCol] = true;
          nodeQueue.offer(neighbor);
        }
      }
      step++;
    }
    return -1;
  }
}
