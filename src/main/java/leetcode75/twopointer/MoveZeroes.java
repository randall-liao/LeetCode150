package leetcode75.twopointer;

public class MoveZeroes {

  public static int[] moveZeros(int[] nums) {
    // Base case
    if (nums == null || nums.length < 2) {
      return nums;
    }
    // define pointers
    int leftPointer = 0;
    int rightPointer = 1;
    // move zero to the back
    while (rightPointer < nums.length) {
      if (nums[leftPointer] != 0) {
        leftPointer++;
        rightPointer++;
      } else if (nums[rightPointer] == 0) {
        rightPointer++;
      } else if (nums[rightPointer] != 0) {
        int temp = nums[rightPointer];
        nums[rightPointer] = nums[leftPointer];
        nums[leftPointer] = temp;
      }
    }
    return nums;
  }
}
