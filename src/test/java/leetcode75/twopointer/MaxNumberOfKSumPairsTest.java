package leetcode75.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxNumberOfKSumPairsTest {

  MaxNumberOfKSumPairs maxPair = new MaxNumberOfKSumPairs();

  @Test
  void maxOperations_exampleOne() {
    int[] inputNums = {1, 2, 3, 4};
    int inputK = 5;
    int expectedOperationCount = 2;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_exampleTwo() {
    int[] inputNums = {3, 1, 3, 4, 3};
    int inputK = 6;
    int expectedOperationCount = 1;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_nullArray() {
    int[] inputNums = null;
    int inputK = 6;
    int expectedOperationCount = 0;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_emptyArray() {
    int[] inputNums = {};
    int inputK = 6;
    int expectedOperationCount = 0;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_extremeLargeValueArray() {
    int[] inputNums = {Integer.MAX_VALUE, 1, 2, 3, 4, Integer.MAX_VALUE};
    int inputK = 5;
    int expectedOperationCount = 2;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_extremeSmallValueArray() {
    int[] inputNums = {Integer.MIN_VALUE, 1, 2, 3, 4, Integer.MIN_VALUE};
    int inputK = 5;
    int expectedOperationCount = 2;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }

  @Test
  void maxOperations_mixedExtremeValueArray() {
    int[] inputNums = {Integer.MIN_VALUE, 1, 2, 3, 4, Integer.MAX_VALUE};
    int inputK = 5;
    int expectedOperationCount = 2;
    assertEquals(expectedOperationCount, maxPair.maxOperations(inputNums, inputK));
  }
}
