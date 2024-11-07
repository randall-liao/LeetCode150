package leetcode75.twopointer;

import java.util.ArrayList;

public class ContainerWithMostWater {

  private static int min(int x, int y) {
    if (x > y) {
      return y;
    } else {
      return x;
    }
  }

  public int maxArea(int[] height) {
    // base case
    if (height == null && height.length < 2) {
      return -1;
    }
    int maxArea = Integer.MIN_VALUE;
    ArrayList<Integer> resultIntList = new ArrayList<>();
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = height.length - 1; j > i; j--) {
        int currentHeight = min(height[i], height[j]);
        int currentLength = j - i;
        int currentArea = currentHeight * currentLength;
        if (currentArea > maxArea) {
          maxArea = currentArea;
        }
      }
    }
    return maxArea;
  }
}
