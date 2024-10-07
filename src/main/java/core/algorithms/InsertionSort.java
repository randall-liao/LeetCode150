package core.algorithms;


public class InsertionSort {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
      int j = i - 1;
      int temp = nums[i];
      while (j >= 0 && temp < nums[j]) {
        // shift larger item to the right
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = temp;
    }
    return nums;
  }
}
