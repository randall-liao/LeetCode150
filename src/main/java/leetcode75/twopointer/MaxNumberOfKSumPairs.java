package leetcode75.twopointer;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

  public int maxOperations(int[] nums, int k) {
    if (nums == null) {
      return 0;
    }
    Arrays.sort(nums);
    int leftPointer = 0;
    int rightPointer = nums.length - 1;
    int operationCounter = 0;
    while (leftPointer < rightPointer) {
      int twoSum = nums[leftPointer] + nums[rightPointer];
      if (twoSum > k) {
        rightPointer--;
      } else if (twoSum < k) {
        leftPointer++;
      } else {
        rightPointer--;
        leftPointer++;
        operationCounter++;
      }
    }
    return operationCounter;
  }
}
