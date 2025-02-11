package patterns.prefixsum;

public class RangeSumQueryImmutable {

  private final Integer[] prefixSumArray;

  public RangeSumQueryImmutable(int[] nums) throws NullPointerException {
    this.prefixSumArray = calculatePrefixSumIntegerArray(nums);
  }

  private static Integer[] calculatePrefixSumIntegerArray(int[] nums) {
    Integer[] prefixSumIntegerArray = new Integer[nums.length];
    if (nums == null || nums.length == 0) {
      throw new NullPointerException("null or empty input array");
    }
    prefixSumIntegerArray[0] = nums[0];
    for (int i = 1; i < prefixSumIntegerArray.length; i++) {
      prefixSumIntegerArray[i] = prefixSumIntegerArray[i - 1] + nums[i];
    }
    return prefixSumIntegerArray;
  }

  public int sumRange(int left, int right) {
    if (left == 0) {
      return this.prefixSumArray[right];
    } else {
      return this.prefixSumArray[right] - this.prefixSumArray[left - 1];
    }
  }
}
