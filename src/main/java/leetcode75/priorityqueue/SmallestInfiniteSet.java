package leetcode75.priorityqueue;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {

  private static final int MAX_INPUT_INTEGER = 1000;

  private final PriorityQueue<Integer> integerPriorityQueue;

  public SmallestInfiniteSet() {
    integerPriorityQueue = new PriorityQueue<>(MAX_INPUT_INTEGER + 1);
    for (int i = 1; i < MAX_INPUT_INTEGER + 1; i++) {
      integerPriorityQueue.add(i);
    }
  }

  public int popSmallest() {
    if (!integerPriorityQueue.isEmpty()) {
      return integerPriorityQueue.poll();
    }
    return -1;
  }

  public void addBack(int num) {
    if (integerPriorityQueue.contains(num)) {
      return;
    }
    integerPriorityQueue.offer(num);
  }
}
