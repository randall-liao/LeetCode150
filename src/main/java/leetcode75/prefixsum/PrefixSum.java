package leetcode75.prefixsum;

import java.util.Arrays;

public class PrefixSum {

  public static int[] prefixSum(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + nums[i];
    }
    return prefixSum;
  }

  public static void main(String[] args) {
    testStandardCase();
    testSingleElementArray();
    testAllZeroes();
    testNegativeNumbers();
    testMixedPositiveAndNegative();
    testEmptyArray();
    testNullInput();
  }

  private static void testStandardCase() {
    int[] arrInput = {0, 1, 2, 3, 4, 5, 6};
    int[] arrExpected = {0, 1, 3, 6, 10, 15, 21};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testSingleElementArray() {
    int[] arrInput = {10};
    int[] arrExpected = {10};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testAllZeroes() {
    int[] arrInput = {0, 0, 0, 0};
    int[] arrExpected = {0, 0, 0, 0};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testNegativeNumbers() {
    int[] arrInput = {-1, -2, -3, -4};
    int[] arrExpected = {-1, -3, -6, -10};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testMixedPositiveAndNegative() {
    int[] arrInput = {1, -1, 2, -2, 3, -3};
    int[] arrExpected = {1, 0, 2, 0, 3, 0};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testEmptyArray() {
    int[] arrInput = {};
    int[] arrExpected = {};
    assertEqualIntArray(arrExpected, prefixSum(arrInput));
  }

  private static void testNullInput() {
    int[] arrInput = null;
    int[] arrExpected = null;
    int[] arrayResult = prefixSum(arrInput);
    if (arrayResult == arrExpected) {
      System.out.println("pass");
    }
  }

  private static void assertEqualIntArray(int[] expected, int[] result) {
    try {
      if (expected.length != result.length) {
        throw new Exception(
            String.format(
                "Incorrect array length expected:%d result:%d\nexpected array: %s, result array: %s",
                expected.length,
                result.length,
                Arrays.toString(expected),
                Arrays.toString(result)));
      }
      for (int i = 0; i < expected.length; i++) {
        if (expected[i] != result[i]) {
          throw new Exception(
              String.format(
                  "Incorrect number at index:%d expected:%d result:%d\nexpected array: %s, result array: %s",
                  i, expected[i], result[i], Arrays.toString(expected), Arrays.toString(result)));
        }
      }
      System.out.println("pass");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
