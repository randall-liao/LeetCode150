package core.algorithms;

import java.util.Arrays;

public class InsertionSortThirdAttempt {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
      int key = nums[i];
      int j = i - 1;
      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = key;
    }
    System.out.println(Arrays.toString(nums));
    return nums;
  }
}
