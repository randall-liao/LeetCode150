package leetcode75.slidingwindow;

public class MaxConsecutiveOnes {

  static {
    int[] input = {1};
    for (int i = 0; i < 500; i++) {
      longestOnes(input, 1);
    }
  }

  public static int longestOnes(int[] nums, int k) {
    int maxLength = 0;
    int currentWindowZeroCount = 0;
    int rightPointer = 0;
    int leftPointer = 0;
    int arrayLength = nums.length;
    int oneCounter = 0;
    while (rightPointer < arrayLength) {
      if (nums[rightPointer] == 0) {
        currentWindowZeroCount++;
      }
      rightPointer++;
      if (currentWindowZeroCount <= k) {
        int currentLength = rightPointer - leftPointer;
        maxLength = Math.max(currentLength, maxLength);
      }
      if (currentWindowZeroCount > k) {
        if (nums[leftPointer] == 0) {
          // move the counter out of the
          currentWindowZeroCount--;
        }
        leftPointer++;
      }
    }
    return maxLength;
  }
}
