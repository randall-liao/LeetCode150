package leetcode75.prefixsum;

import static leetcode75.prefixsum.PrefixSum.prefixSum;
import static leetcode75.prefixsum.PrefixSum.prefixSumNoExtraSpace;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class PrefixSumTest {

  @Test
  public void testStandardCase() {
    int[] arrInput = {0, 1, 2, 3, 4, 5, 6};
    int[] arrExpected = {0, 1, 3, 6, 10, 15, 21};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testSingleElementArray() {
    int[] arrInput = {10};
    int[] arrExpected = {10};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testAllZeroes() {
    int[] arrInput = {0, 0, 0, 0};
    int[] arrExpected = {0, 0, 0, 0};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testNegativeNumbers() {
    int[] arrInput = {-1, -2, -3, -4};
    int[] arrExpected = {-1, -3, -6, -10};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testMixedPositiveAndNegative() {
    int[] arrInput = {1, -1, 2, -2, 3, -3};
    int[] arrExpected = {1, 0, 2, 0, 3, 0};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testEmptyArray() {
    int[] arrInput = {};
    int[] arrExpected = {};
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testNullInput() {
    int[] arrInput = null;
    int[] arrExpected = null;
    assertArrayEquals(arrExpected, prefixSum(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceStandardCase() {
    int[] arrInput = {0, 1, 2, 3, 4, 5, 6};
    int[] arrExpected = {0, 1, 3, 6, 10, 15, 21};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceSingleElementArray() {
    int[] arrInput = {10};
    int[] arrExpected = {10};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceAllZeroes() {
    int[] arrInput = {0, 0, 0, 0};
    int[] arrExpected = {0, 0, 0, 0};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceNegativeNumbers() {
    int[] arrInput = {-1, -2, -3, -4};
    int[] arrExpected = {-1, -3, -6, -10};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceMixedPositiveAndNegative() {
    int[] arrInput = {1, -1, 2, -2, 3, -3};
    int[] arrExpected = {1, 0, 2, 0, 3, 0};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceEmptyArray() {
    int[] arrInput = {};
    int[] arrExpected = {};
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }

  @Test
  public void testPrefixSumNoExtraSpaceNullInput() {
    int[] arrInput = null;
    int[] arrExpected = null;
    assertArrayEquals(arrExpected, prefixSumNoExtraSpace(arrInput));
  }
}
