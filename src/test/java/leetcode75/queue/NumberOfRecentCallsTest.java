package leetcode75.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberOfRecentCallsTest {

  private NumberOfRecentCalls numberOfRecentCalls;

  @BeforeEach
  void setUp() {
    numberOfRecentCalls = new NumberOfRecentCalls();
  }

  @Test
  void ping_exampleOne() {
    int[] ping = {1, 100, 3001, 3002};
    int[] expected = {1, 2, 3, 3};
    for (int i = 0; i < ping.length; i++) {
      assertEquals(expected[i], numberOfRecentCalls.ping(ping[i]));
    }
  }
}
