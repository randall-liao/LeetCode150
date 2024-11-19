package leetcode75.slidingwindow;

import static leetcode75.slidingwindow.LongestSubarrayAfterDelete.longestSubarray;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubarrayAfterDeleteTest {

  @Test
  void longestSubarray_exampleOne() {
    int[] inputArray = {1, 1, 0, 1};
    int expected = 3;
    assertEquals(expected, longestSubarray(inputArray));
  }

  @Test
  void longestSubarray_exampleTwo() {
    int[] inputArray = {0, 1, 1, 1, 0, 1, 1, 0, 1};
    int expected = 5;
    assertEquals(expected, longestSubarray(inputArray));
  }

  @Test
  void longestSubarray_exampleThree() {
    int[] inputArray = {1, 1, 1};
    int expected = 2;
    assertEquals(expected, longestSubarray(inputArray));
  }
}
