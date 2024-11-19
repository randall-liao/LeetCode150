package leetcode75.slidingwindow;

public class LongestSubarrayAfterDelete {

  public static int longestSubarray(int[] nums) {
    int maxLengthOfSubarray = 0;
    int leftPointer = 0;
    int rightPointer = 0;
    int zeroCount = 0;
    while (rightPointer < nums.length) {
      if (nums[rightPointer] == 0) {
        zeroCount++;
      }
      rightPointer++;
      while (zeroCount == 2) {
        if (nums[leftPointer] == 0) {
          zeroCount--;
        }
        leftPointer++;
      }
      maxLengthOfSubarray = Math.max(maxLengthOfSubarray, rightPointer - leftPointer - 1);
    }
    return maxLengthOfSubarray;
  }
}
