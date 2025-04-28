package leetcode75.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> complementMap = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (complementMap.containsKey(complement)) {
        return new int[] {complementMap.get(complement), i};
      }
      complementMap.put(nums[i], i);
    }
    return new int[] {};
  }
}
