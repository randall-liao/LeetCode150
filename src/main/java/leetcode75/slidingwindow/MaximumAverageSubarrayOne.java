package leetcode75.slidingwindow;

public class MaximumAverageSubarrayOne {

  public double findMaxAverage(int[] nums, int k) {
    if (nums == null || k == 0) {
      throw new IllegalArgumentException("Null nums input");
    }
    double maxAverage = Double.NEGATIVE_INFINITY;
    for (int i = k - 1; i < nums.length; i++) {
      int sumOfCurrentWindow = 0;
      for (int j = i - k + 1; j <= i; j++) {
        sumOfCurrentWindow += nums[j];
      }
      double averageOfCurrentWindow = (double) sumOfCurrentWindow / k;
      if (averageOfCurrentWindow > maxAverage) {
        maxAverage = averageOfCurrentWindow;
      }
    }
    return maxAverage;
  }
}
