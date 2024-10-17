package core.algorithms;

public class BinarySearchForthAttempt {

  public static int search(int[] nums, int keys) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int leftBoundaryIndex = 0;
    int rightBoundaryIndex = nums.length - 1;
    while (leftBoundaryIndex <= rightBoundaryIndex) {
      int midIndex = leftBoundaryIndex + (rightBoundaryIndex - leftBoundaryIndex) / 2;
      if (nums[midIndex] == keys) {
        return midIndex;
      }
      if (nums[midIndex] > keys) {
        // search to the left side of the middle point
        rightBoundaryIndex = midIndex - 1;
      } else {
        // search to the right half of the inputArray
        leftBoundaryIndex = midIndex + 1;
      }
    }

    return -1;
  }
}
