package leetcode75.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void twoSum() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};
    int[] result = TwoSum.twoSum(nums, target);
    assertArrayEquals(expected, result);
  }
}
