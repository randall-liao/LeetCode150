package leetcode75.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {

  @Test
  void moveZeros_nullArray() {
    int[] inputArray = null;
    int[] expectedResult = null;
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_emptyArray() {
    int[] inputArray = {};
    int[] expectedResult = {};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_singleZeroArray() {
    int[] inputArray = {0};
    int[] expectedResult = {0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_singleNonZeroArray() {
    int[] inputArray = {1};
    int[] expectedResult = {1};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_ExampleOne() {
    int[] inputArray = {0, 1, 0, 3, 12};
    int[] expectedResult = {1, 3, 12, 0, 0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_zerosInMiddleOfArray() {
    int[] inputArray = {3, 0, 1, 0, 12};
    int[] expectedResult = {3, 1, 12, 0, 0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_continuousZerosOnHead() {
    int[] inputArray = {0, 0, 1, 3, 12};
    int[] expectedResult = {1, 3, 12, 0, 0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_continuousZerosOnTail() {
    int[] inputArray = {1, 3, 12, 0, 0};
    int[] expectedResult = {1, 3, 12, 0, 0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_AllZeroArray() {
    int[] inputArray = {0, 0, 0, 0, 0};
    int[] expectedResult = {0, 0, 0, 0, 0};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }

  @Test
  void moveZeros_oneLengthNonZeroArray() {
    int[] inputArray = {1};
    int[] expectedResult = {1};
    assertArrayEquals(expectedResult, MoveZeroes.moveZeros(inputArray));
  }
}
