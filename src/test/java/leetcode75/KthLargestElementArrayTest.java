package leetcode75;

import static org.junit.jupiter.api.Assertions.*;

import leetcode75.priorityqueue.KthLargestElementArray;
import org.junit.jupiter.api.Test;

class KthLargestElementArrayTest {

  KthLargestElementArray solution = new KthLargestElementArray();

  @Test
  void findKthLargest() {
    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    int expected = 5;
    int actual = solution.findKthLargest(nums, k);
    assertEquals(expected, actual);
  }

  @Test
  void findKthLargest2() {
    int[] nums = {3, 2, 1, 5, 6, 4};
  }

  @Test
  void findKthLargest_onElementArray() {
    int[] nums = {1};
    int k = 1;
    int expected = 1;
    int actual = solution.findKthLargest(nums, k);
    assertEquals(expected, actual);
  }

  @Test
  void findKthLargest_extremeValue() {
    int[] nums = {Integer.MIN_VALUE, -1, 0, 48, Integer.MAX_VALUE};
    int k = 1;
    int expected = 1;
    int actual = solution.findKthLargest(nums, k);
    assertEquals(expected, actual);
  }
}
