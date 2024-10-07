package core.algorithms;

import java.util.Arrays;

public class InsertionSort {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for(int i = 1; i < nums.length; i++) {
      int temp = nums[i];
      int j = i;
      while(j > 0 && temp > nums[j - 1]) {
        // if the element to the right is grater than the one to its left, swap right to the left

      }
    }
    return nums;
  }
}
