package core.algorithms;

public class SelectionSort {

  public static int[] sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    for (int i = 0; i < nums.length; i++) {
      int currentMinIndex = i;
      int currentMinInt = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < currentMinInt) {
          currentMinInt = nums[j];
          currentMinIndex = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[currentMinIndex];
      nums[currentMinIndex] = temp;
    }
    return nums;
  }
}
