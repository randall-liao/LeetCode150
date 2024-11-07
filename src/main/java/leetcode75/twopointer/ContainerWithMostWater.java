package leetcode75.twopointer;

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
    int leftBoundaryPointer = 0;
    int rightBoundaryPointer = height.length - 1;
    while(leftBoundaryPointer < rightBoundaryPointer) {
      int currentHeight = min(height[leftBoundaryPointer], height[rightBoundaryPointer]);
      int currentLength = rightBoundaryPointer - leftBoundaryPointer;
      int currentArea = currentHeight * currentLength;
      if(currentArea > maxArea) {
        maxArea = currentArea;
      }
      if(height[leftBoundaryPointer] > height[rightBoundaryPointer]) {
        rightBoundaryPointer--;
      } else {
        leftBoundaryPointer++;
      }
    }
    return maxArea;
  }
}
