package leetcode75.slidingwindow;

public class MaximumAverageSubarrayOne {

  public double findMaxAverage(int[] nums, int k) {
    if (nums == null || k == 0) {
      throw new IllegalArgumentException("Null nums input");
    }
    double sumOfCurrentWindow = 0;
    for (int i = 0; i < k; i++) {
      sumOfCurrentWindow += nums[i];
    }
    double maxAverage = sumOfCurrentWindow / k;
    for (int i = 1; i <= nums.length - k; i++) {
      sumOfCurrentWindow -= nums[i - 1];
      sumOfCurrentWindow += nums[i + k - 1];
      double currentWindowAverage = sumOfCurrentWindow / k;
      if (currentWindowAverage > maxAverage) {
        maxAverage = currentWindowAverage;
      }
    }
    return maxAverage;
  }
}
