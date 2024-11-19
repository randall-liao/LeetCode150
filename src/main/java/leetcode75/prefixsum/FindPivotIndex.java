package leetcode75.prefixsum;

public class FindPivotIndex {

  public static int pivotIndex(int[] nums) {
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for (int i = 1; i < prefixSum.length; i++) {
      // calculate prefixSum
      prefixSum[i] = prefixSum[i - 1] + nums[i];
    }
    // case when pivot index is zero
    int leftSubarraySum = 0;
    int rightSubarraySum = prefixSum[prefixSum.length - 1] - prefixSum[0];
    if (leftSubarraySum == rightSubarraySum) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      // calculate sum of subarray left to the i and subarray right to the i
      leftSubarraySum = prefixSum[i - 1];
      rightSubarraySum = prefixSum[prefixSum.length - 1] - prefixSum[i];
      if (leftSubarraySum == rightSubarraySum) {
        return i;
      }
    }
    return -1;
  }
}
