package leetcode75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

  MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

  @Test
  void longestOnes_exampleOne() {
    int[] inputNums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    int k = 2;
    int expected = 6;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_exampleTwo() {
    int[] inputNums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    int k = 3;
    int expected = 10;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_allOne() {
    int[] inputNums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int k = 3;
    int expected = 10;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_allZero() {
    int[] inputNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int k = 0;
    int expected = 0;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_allZeroReplaceAll() {
    int[] inputNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int k = 10;
    int expected = 10;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_longestAtHead() {
    int[] inputNums = {1, 1, 0, 1, 1, 0, 1, 0, 0, 0};
    int k = 1;
    int expected = 5;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_longestAtTail() {
    int[] inputNums = {0, 0, 0, 0, 1, 0, 0, 1, 0, 1};
    int k = 3;
    int expected = 6;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }

  @Test
  void longestOnes_exampleThree() {
    int[] inputNums = {0, 0, 0, 1};
    int k = 4;
    int expected = 4;
    assertEquals(expected, MaxConsecutiveOnes.longestOnes(inputNums, k));
  }
}
