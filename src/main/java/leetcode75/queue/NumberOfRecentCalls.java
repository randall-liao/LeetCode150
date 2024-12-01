package leetcode75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {

  Queue<Integer> requests;

  Integer REQUEST_TIME_OUT = 3000;

  public NumberOfRecentCalls() {
    this.requests = new LinkedList<>();
  }

  public int ping(int t) {
    this.requests.add(t);
    if (this.requests.isEmpty()) {
      return 0;
    }
    int head = this.requests.element();
    while (t - head > REQUEST_TIME_OUT) {
      this.requests.remove();
      if (this.requests.isEmpty()) {
        return 0;
      }
      head = this.requests.element();
    }
    return this.requests.size();
  }
}
