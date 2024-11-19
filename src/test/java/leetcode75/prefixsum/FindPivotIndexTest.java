package leetcode75.prefixsum;

import static leetcode75.prefixsum.FindPivotIndex.pivotIndex;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

  @Test
  void pivotIndex_exampleOne() {
    int[] inputArray = {1, 7, 3, 6, 5, 6};
    int expected = 3;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_exampleTwo() {
    int[] inputArray = {1, 2, 3};
    int expected = -1;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_exampleThree() {
    int[] inputArray = {2, 1, -1};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_singleElement() {
    // Single element array; pivot index is 0
    int[] inputArray = {10};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_allZeros() {
    // All elements are zero; first index is the pivot
    int[] inputArray = {0, 0, 0, 0};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_noPivotDueToUnequalSums() {
    // No pivot index exists
    int[] inputArray = {1, 2, 3, 4, 5};
    int expected = -1;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotAtLastIndex() {
    // Pivot index at the last position
    int[] inputArray = {1, -1, 1, -1, 0};
    int expected = 4;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_largeArray() {
    // Large array to test performance
    int size = 10000;
    int[] inputArray = new int[size];
    for (int i = 0; i < size; i++) {
      inputArray[i] = 1;
    }
    // Pivot at index 4999 (0-based), since left sum = 4999, right sum = 5000
    // No pivot exists
    assertEquals(-1, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_largeArrayWithPivot() {
    // Large array with a pivot
    int size = 10001;
    int[] inputArray = new int[size];
    for (int i = 0; i < size; i++) {
      inputArray[i] = 1;
    }
    // Pivot at index 5000, left sum = 5000, right sum = 5000
    inputArray[5000] = 0;
    int expected = 5000;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_allNegativeNumbers() {
    // All elements are negative; check for pivot
    int[] inputArray = {-2, -1, -1, -1, -2};
    int expected = 2;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_zeroSumOnBothSides() {
    // Pivot where both sides sum to zero
    int[] inputArray = {0, 0, 0, 0, 0};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotNotAtMiddle() {
    // Pivot not at the middle
    int[] inputArray = {2, 1, -1, 0, 1, -1, 2};
    int expected = 3;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_twoElements_pivotAtZero() {
    // Two elements where pivot is at index 0
    int[] inputArray = {0, 0};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_twoElements_pivotDoesNotExist() {
    // Two elements where no pivot exists
    int[] inputArray = {1, 2};
    int expected = -1;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotWithLargeNumbers() {
    // Array with large numbers to test integer overflow
    int[] inputArray = {Integer.MAX_VALUE, -Integer.MAX_VALUE, 0};
    int expected = 2;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotWithMixedLargeNumbers() {
    // Array with a mix of large positive and negative numbers
    int[] inputArray = {1000, -1000, 0, 1000, -1000, 0};
    int expected = 2;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotAtFirstIndex() {
    // Pivot at the first index with non-zero sum on the right
    int[] inputArray = {0, 1, -1};
    int expected = 0;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotWithRepeatedElements() {
    // Array with repeated elements and a pivot
    int[] inputArray = {2, 2, 2, 2, 2, 2, 2};
    int expected = 3;
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotWithAlternatingSigns() {
    // Array with alternating positive and negative numbers
    int[] inputArray = {1, -1, 1, -1, 1, -1, 1};
    int expected = 0; // requirements said the leftmost position would be fine
    assertEquals(expected, pivotIndex(inputArray));
  }

  @Test
  void pivotIndex_pivotWithLargeNegativeSum() {
    // Array where the pivot balances a large negative sum
    int[] inputArray = {10, -10, 10, -10, 10, -10, 0};
    int expected = 6;
    assertEquals(expected, pivotIndex(inputArray));
  }
}
