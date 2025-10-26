package leetcode75.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementArray {

  public int findKthLargest(int[] nums, int k) {
    Queue<Integer> pirorityQueue = new PriorityQueue<>(nums.length, Collections.reverseOrder());
    for (Integer num : nums) {
      pirorityQueue.offer(num);
    }
    int max = 0;
    for (int i = 0; i < k; i++) {
      max = pirorityQueue.poll();
    }
    return max;
  }
}
