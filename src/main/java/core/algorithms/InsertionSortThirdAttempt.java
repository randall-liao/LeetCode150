package core.algorithms;

import java.util.Arrays;

public class InsertionSortThirdAttempt {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
      int key = nums[i];
      for (int j = i - 1; j >= 0; j--) {
        if (key < nums[j]) {
          // Move elements of nums that are greater than 'key' one position to the right
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
        } else {
          nums[j] = key;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(nums));
    return nums;
  }
}
