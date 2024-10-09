package core.algorithms;

import java.util.Arrays;

public class InsertionSortSecondAttempt {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
      int temp = nums[i];
      int j = i - 1;
      while (j >= 0 && temp < nums[j]) {
        nums[j + 1] = nums[j];
        j--;
      }
      // insert temp into the opening
      nums[j + 1] = temp; // j was deducted 1 extra time
    }
    System.out.println(Arrays.toString(nums));
    return nums;
  }
}
