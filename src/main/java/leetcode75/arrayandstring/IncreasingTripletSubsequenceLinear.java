package leetcode75.arrayandstring;

public class IncreasingTripletSubsequenceLinear {

  public static boolean increasingTriplet(int[] nums) {
    if (nums == null || nums.length < 3) {
      return false;
    }
    Integer firstIntInTriplet = Integer.MAX_VALUE;
    Integer secondIntInTriplet = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= firstIntInTriplet) {
        firstIntInTriplet = num;
      } else if (num <= secondIntInTriplet) {
        secondIntInTriplet = num;
      } else {
        return true;
      }
    }
    return false;
  }
}
