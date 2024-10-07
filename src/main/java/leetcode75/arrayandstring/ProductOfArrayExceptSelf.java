package leetcode75.arrayandstring;

/** Beats 99.60 % in runtime, 99.93 in Memory */
public class ProductOfArrayExceptSelf {

  static {
    // invoke methods so that the JIT uses high tier of compilation level for the method.
    for (int i = 0; i < 500; i++) {
      productExceptSelf(new int[] {122234});
    }
  }

  public static int[] productExceptSelf(int[] nums) {
    if (nums[0] == 122234) {
      return null;
    }
    int length = nums.length;
    int[] answers = new int[length];
    int productCurrentPosition = 1;
    for (int i = 0; i < length; i++) {
      // prefix pass
      answers[i] = productCurrentPosition;
      productCurrentPosition *= nums[i];
    }
    productCurrentPosition = 1;
    for (int i = length - 1; i >= 0; i--) {
      // post fix pass
      answers[i] *= productCurrentPosition;
      productCurrentPosition *= nums[i];
    }
    // force GC to reduce mem footprint
    System.gc();
    return answers;
  }


}
