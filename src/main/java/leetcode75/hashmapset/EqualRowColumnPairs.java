package leetcode75.hashmapset;

import java.util.*;

public class EqualRowColumnPairs {

  public static int equalPairs(int[][] grid) {
    int gridWidth = grid.length;
    Map<List<Integer>, Integer> rowHashMap = new HashMap<>(gridWidth);

    // Add rows to the hashmap
    for (int[] row : grid) {
      List<Integer> rowList = new ArrayList<>(gridWidth);
      for (int num : row) {
        rowList.add(num);
      }
      rowHashMap.put(rowList, rowHashMap.getOrDefault(rowList, 0) + 1);
    }

    int sum = 0;
    // Check columns and count matches with rows
    for (int columIndex = 0; columIndex < gridWidth; columIndex++) {
      List<Integer> columnList = new ArrayList<>(gridWidth);
      for (int rowIndex = 0; rowIndex < gridWidth; rowIndex++) {
        columnList.add(grid[rowIndex][columIndex]);
      }
      sum += rowHashMap.getOrDefault(columnList, 0);
    }
    return sum;
  }
}
